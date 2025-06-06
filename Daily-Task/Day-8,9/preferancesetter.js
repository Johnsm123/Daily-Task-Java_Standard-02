function setUserPreferences(
  language = "English",
  theme = "Light",
  notifications = true
) {
  const preferences = {
    language: language,
    theme: theme,
    notifications: notifications,
  };

  console.log(" User Preferences:", preferences);
  return preferences;
}

// Example usage:
setUserPreferences(); // All defaults
setUserPreferences("French", "Dark", false); // Custom values
