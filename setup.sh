#!/bin/bash
sudo rm -r /home/training/developer
sudo rm /usr/share/java/kafka-connect-jdbc/kafka-connect-jdbc-3.0.0.jar
sudo cp /home/training/tutorial/kafka-connect-jdbc-3.1.0.jar /usr/share/java/kafka-connect-jdbc
sudo chmod ugo+r /usr/share/java/kafka-connect-jdbc/kafka-connect-jdbc-3.1.0.jar

