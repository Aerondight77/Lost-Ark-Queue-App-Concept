# THIS ANDROID APP IS ONLY A CONCEPT! PLEASE READ EVERYTHING

**Currently, it is an incomplete app but already has the basic main features implemented.**

## Backstory

Before getting into the whys and whats of this app, some backstory is needed. There's this PC game called "[Lost Ark](https://www.playlostark.com/en-us)" and it has serious issues with the number of bots taking up the server. 
This causes servers to be overloaded with bots, and thus, leads to a queue to get in to play. The queue can take as short as 5 minutes to over 2 hours before players can actually get in and play. A lot of players have responsibilities 
outside of the game, so a majority of them simply do not have a lot of time to play the game (I've read some people can only play 1-2 hours a day). Given that there are queues that could last over 2 hours, some players cannot play at all 
because all they could do in their short freetime is to wait in the queue. I've read in some forums how players "get around" this by simply launching the game early and do other things while waiting in the queue. I remember reading one 
post where the person calls their wife at home to launch the game and wait in queue 1 hour before coming home from work, and when he did come home, he was still in queue and had 30 minutes left to play. I have done something similar to 
this as well. I wake up, launch the game and queue, then eat breakfast, do chores, do other things until one and a half hours later I get in and can play. Sometimes the queue is short but I had to do other things before playing and thus,
I had to go AFK, and when I came back to play I got kicked from the server for being AFK -- so I had to queue again but this time it's even longer. You can see how frustrating this can be. This led me to think: "if I know beforehand the 
queue number for my server somehow, I can estimate when to launch the game so I can start playing on time and not get kicked for being AFK." This concept app is my temporary solution.

## Purpose

The purpose of the app is to let players know how long the queue is without even launching the game (note that the game takes nearly 4 minutes to launch). This allows players to estimate when or whether they should launch the game and 
queue now or later. The players won't have to worry too much about getting kicked for AFK if the queue is short, or run out of time to play if the queue is long. Note that the number of players in the queue vs. the estimated time remaining 
until the player is let into the server is pretty consistent (ex: 5000 is equivalent to waiting 15-30 minutes, 20000 is equivalent to waiting 1:30 - 2 hours).

## Usage

Upon launching the app, the user is presented with the region the player is in (ex: NA West, NA East, etc.). When the user selects their region, they are presented with a list of server names of that particular region. When the player 
selects their server, on the top of the screen there should be a number of the last entered queue number for that server. This is the screen that connects to a central server that receives a queue number from a player, and updates the 
most recently entered value onto the screen. It is a community driven app so it requires volunteering from players. Players can then use this queue number presented to them and estimate when or whether they should launch the game and 
queue.

## Missing features

* There is currently no implementation of connecting to a server and updating that queue number value from the server because: 1) I do not want to pay for a server just for a concept app that won't likely be launched, and 2) I currently 
lack the experience to do so.

* Some region and server selections are incomplete because it's simply just copying and pasting the same code from regions and servers that already have code in them. No point in repeating this since the basic main features are already done.

# Reason of abandonment

As of now, the developers of the game have already "fixed" the queue issue by implementing some bot banning feature in the backend. The bots are constantly being banned as far as I know, so there currently are no queues ever since that
was implemented. Without queues nowadays, this app has already become obsolete. No point in further developing this app when the initial problem is already gone.
