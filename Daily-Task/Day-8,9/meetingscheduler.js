let meetingParticipants = [];

function addParticipant(name) {
  if (!name) {
    console.log(" Name is required to add a participant.");
    return;
  }
  meetingParticipants.push(name);
  console.log(` ${name} added to the meeting.`);
  displayParticipants();
}

function displayParticipants() {
  console.log("👥 Current Meeting Participants:");
  meetingParticipants.forEach((participant, index) => {
    console.log(`${index + 1}. ${participant}`);
  });
}

// Example usage:
addParticipant("Alice");
addParticipant("Bob");
addParticipant("John Samuel");
