let totalAmount = 0;
const expenseList = document.getElementById("expense-list");
const totalAmountElement = document.getElementById("total-amount");

function addExpense() {
    const expenseName = document.getElementById("expense-name").value;
    const expenseAmount = document.getElementById("expense-amount").value;

    if (!expenseName || !expenseAmount) {
        alert("Please enter both expense name and amount.");
        return;
    }

    const expense = {
        name: expenseName,
        amount: parseFloat(expenseAmount)
    };

    totalAmount += expense.amount;
    totalAmountElement.textContent = totalAmount.toFixed(2);

    const listItem = document.createElement("li");
    listItem.textContent = `${expense.name}: $${expense.amount.toFixed(2)}`;

    expenseList.appendChild(listItem);

    document.getElementById("expense-name").value = "";
    document.getElementById("expense-amount").value = "";
}

function clearExpenses() {
    totalAmount = 0;
    totalAmountElement.textContent = totalAmount.toFixed(2);
    expenseList.innerHTML = "";
}
