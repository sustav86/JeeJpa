#!/bin/sh
mvn clean package && docker build -t com.sustav/javaeejpa .
docker rm -f javaeejpa || true && docker run -d -p 8080:8080 -p 4848:4848 --name javaeejpa com.sustav/javaeejpa 
