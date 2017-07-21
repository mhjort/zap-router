#!/bin/sh

protoc -I=resources --java_out=src/java resources/connection.proto
