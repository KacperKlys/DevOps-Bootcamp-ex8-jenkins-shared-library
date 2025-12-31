#!/usr/bin/env groovy

import com.example.Git

def call(String remote) {
    return new Git(this).remoteConfig(remote)
}