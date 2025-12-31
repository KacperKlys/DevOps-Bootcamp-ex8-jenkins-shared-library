#!/usr/bin/env groovy

import com.example.Git

def call(String userName) {
    return new Git(this).userConfig(userName)
}