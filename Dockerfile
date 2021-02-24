FROM itzg/minecraft-server:latest

ENV VERSION="1.16.1"
COPY build/libs/*.jar /mods/

