// Function to calculate total cost using rest parameter
function addToCart(...items) {
    const total = items.reduce((sum, item) => sum + item.price, 0);
    return Number(total.toFixed(2));
}

// Function to apply discount based on total cost
function applyDiscount(totalCost) {
    let discountPercentage = 0;

    if (totalCost >= 80) {
        discountPercentage = 20;
    } else if (totalCost >= 50) {
        discountPercentage = 10;
    }

    if (discountPercentage === 0) {
        return `Not eligible for discount, please pay ${totalCost.toFixed(2)}`;
    }

    const discountedAmount = totalCost * (1 - discountPercentage / 100);
    return `${discountPercentage} percentage discount applied in total bill, please pay ${discountedAmount.toFixed(2)}`;
}

// Test the functions
const item1 = {name: 'Socks', price: 5.99};
const item2 = {name: 'T-shirt', price: 14.50};
const item3 = {name: 'Shorts', price: 29.95};

const totalCost = addToCart(item1, item2, item3);
const discountedTotal = applyDiscount(totalCost);
console.log(discountedTotal);