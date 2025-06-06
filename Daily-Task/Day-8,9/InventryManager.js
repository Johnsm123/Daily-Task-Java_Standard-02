let officeSupplies = [];

// Function to add a supply item
function addSupply(item) {
  if (!item) {
    console.log(" Supply name is required.");
    return;
  }
  officeSupplies.push(item);
  console.log(` '${item}' added to inventory.`);
  displaySupplies();
}

// Function to remove a supply item
function removeSupply(item) {
  const index = officeSupplies.indexOf(item);
  if (index > -1) {
    officeSupplies.splice(index, 1);
    console.log(` '${item}' removed from inventory.`);
  } else {
    console.log(` '${item}' not found in inventory.`);
  }
  displaySupplies();
}

// Function to display current inventory
function displaySupplies() {
  if (officeSupplies.length === 0) {
    console.log(" Inventory is currently empty.");
  } else {
    console.log(" Current Office Supplies Inventory:");
    officeSupplies.forEach((item, index) => {
      console.log(`${index + 1}. ${item}`);
    });
  }
}

// Example usage:
addSupply("Pens");
addSupply("Notebooks");
addSupply("Staplers");
removeSupply("Notebooks");
removeSupply("Markers");
