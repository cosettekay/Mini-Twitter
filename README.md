# Mini-Twitter

## Overview

This project is a Java-based Mini Twitter application with a graphical user interface (GUI) built using Java Swing. The application features a centralized admin control panel for managing users and user groups, as well as individual user views for posting and viewing tweets. 

## Features

### Admin Control Panel
- **Create Users**: Add new users with a unique ID.
- **Create User Groups**: Add new user groups with a unique ID. User groups can contain other users or groups recursively.
- **View Tree Structure**: Display the hierarchical structure of users and groups.
- **Statistics and Analysis**: Output the total number of users, groups, tweet messages, and the percentage of positive tweets.

### User View
- **Follow Users**: Follow other users by their ID.
- **Post Tweets**: Post short messages that are shared with followers.
- **News Feed**: See the list of tweets from users being followed.
- **Real-Time Updates**: News feeds are updated automatically when new tweets are posted.

## Design Patterns Used
- **Singleton**: Ensures a single instance of the admin control panel.
- **Observer**: Updates followers' news feeds in real-time when a user posts a tweet.
- **Visitor**: Performs operations like counting users, groups, and tweets.
- **Composite**: Manages the hierarchical structure of users and user groups.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or later

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/minitwitter.git
2. Navigate to the project's directory:
   ```bash
   cd <project directory>
4. Compile the project:
   ```bash
   javac -d bin src/**/*.java
6. Run the application

## Usage

### Admin Control Panel
- Use the text fields and buttons to create users and groups.
- Select a user from the tree view and click "Open User View" to manage their tweets and followings.

<img width="436" alt="image" src="https://github.com/cosettekay/Mini-Twitter/assets/71306558/7e5e143b-fcea-48ee-badb-4393f7f1c934">

### User View
- Follow users by entering their ID and clicking "Follow".
- Post tweets using the text area and "Post" button.
- View tweets in the news feed list.

<img width="437" alt="image" src="https://github.com/cosettekay/Mini-Twitter/assets/71306558/fe157695-3a91-44e7-b074-2ae13e20874f">

## Demo
A short demo video explaining the functionality and design patterns used in the project is available on YouTube: [Mini Twitter Demo](-)

## Contributing
Contributions are welcome! Please open an issue or submit a pull request for any bugs or feature requests.

