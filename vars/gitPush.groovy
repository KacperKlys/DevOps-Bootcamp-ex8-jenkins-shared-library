#!/usr/bin/env groovy

import com.example.Git

def call(String branch, String msg) {
    return new Git(this).push(branch, msg)
}