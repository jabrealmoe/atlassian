package com.example

import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.sal.api.user.UserManager

"This file is located inside a script root. That means that this script (and any other scripts added to this directory) " +
"can be run from the Script Console (or any other ScriptRunner extension point such as listeners, post-functions, etc). " +
"If instead you'd like to run your scripts directly from IntelliJ IDEA, " +
"take a look at: https://scriptrunner.adaptavist.com/latest/jira/DevEnvironment.html#_external_tool_for_running_scripts_against_jira."


def userMan = ComponentAccessor.getUserManager() as UserManager
def no = userMan.totalUserCount
def msg = "My instance contains ${userMan.totalUserCount} user(s)."