#!/usr/bin/env groovy

def call() {
    echo 'Testing nodejs application...'
    dir("app") {
        sh 'npm install'
        sh 'npm run test'
    }
}