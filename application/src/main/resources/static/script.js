// Example fetch for products page
async function loadProducts() {
  const response = await fetch("http://localhost:8080/products");
  const products = await response.json();

  const tableBody = document.querySelector("#product-table-body");
  tableBody.innerHTML = "";

  products.forEach(p => {
    const row = `
      <tr>
        <td>${p.product_name}</td>
        <td>$${p.product_cost}</td>
        <td>${p.product_description}</td>
      </tr>`;
    tableBody.insertAdjacentHTML("beforeend", row);
  });
}

document.addEventListener("DOMContentLoaded", () => {
  if (window.location.pathname.includes("products.html")) {
    loadProducts();
  }
});
