#!/bin/bash
mvn clean install
java -jar target/ai-autonomous-scaling-kafka-0.0.1-SNAPSHOT.jar
