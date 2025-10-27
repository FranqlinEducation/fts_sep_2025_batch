async function fetchProducts() {
  try {
    const response = await fetch("http://localhost:8080/products");
    if (!response.ok) throw new Error("Failed to fetch products");

    const products = await response.json();
    populateTable(products);
  } catch (error) {
    console.error("Error:", error);
  }
}

function getAvailabilityStatus(quantity) {
  if (quantity > 50) return { text: "In Stock", class: "in-stock" };
  if (quantity > 20) return { text: "Low Stock", class: "low-stock" };
  return { text: "Out of Stock", class: "out-stock" };
}

function populateTable(products) {
  const tbody = document.querySelector("#productTable tbody");
  tbody.innerHTML = "";

  products.forEach(p => {
    const status = getAvailabilityStatus(p.quantity || p.product_quantity || 0);
    const row = `
      <tr>
        <td>${p.product_name}</td>
        <td>$${p.product_cost.toFixed(2)}</td>
        <td>${p.product_quantity || 0}</td>
        <td><span class="status ${status.class}">${status.text}</span></td>
      </tr>`;
    tbody.insertAdjacentHTML("beforeend", row);
  });
}

// Load data when page loads
document.addEventListener("DOMContentLoaded", fetchProducts);
