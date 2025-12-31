#!/usr/bin/env groovy

package com.example

class Git implements Serializable{

    def script

    Git(script) {
        this.script = script
    }

    def userConfig(String name) {
        script.sh "git config --global user.email $name@example.com"
        script.sh "git config --global user.name $name"
    }

    def remoteConfig(String repo) {
        script.withCredentials([script.usernamePassword(credentialsId: 'githubtkn', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
            script.sh "git remote set-url origin https://'${script.USER}':'${script.PASS}'$repo"
        }
    }

    def push(String branch, String msg) {
        script.sh 'git add app/package.json'
        script.sh "git commit -m $msg"
        script.sh "git push origin HEAD:$branch"
    }
}
