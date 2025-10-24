document.getElementById("loginForm").addEventListener("submit", async function (event) {
  event.preventDefault();

  const userName = document.getElementById("username").value.trim();
  const password = document.getElementById("password").value.trim();

  if (!userName || !password) {
    alert("Please fill in both username and password.");
    return;
  }

  try {
    const response = await fetch("/login", {
      method: "POST",
      headers: {
        "Content-Type": "application/x-www-form-urlencoded",
      },
      body: new URLSearchParams({ userName, password }),
    });

    if (response.ok) {
      const result = await response.text(); // backend returns string
      alert("Login successful: " + result);
      // Redirect if needed:
      // window.location.href = "/dashboard";
    } else {
      const errorText = await response.text();
      alert("Login failed: " + errorText);
    }
  } catch (err) {
    console.error("Error during login:", err);
    alert("An error occurred. Please try again.");
  }
});
