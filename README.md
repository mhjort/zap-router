# zap-router

Multiplayer Game Server

## Usage

Start by running

  lein run

It opens two ports: 10001 for player1 and 10002 for player2

When there is a socket connection to both ports server will send following event to client

`START:player1` or `START:player2`

The event is UTF-8 formatted string

