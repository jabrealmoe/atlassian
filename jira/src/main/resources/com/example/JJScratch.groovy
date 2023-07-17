package com.example




import java.util.logging.Logger

def log = Logger.getLogger("JJLogger")

import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.jira.issue.Issue
import com.atlassian.jira.event.issue.IssueEvent
import com.atlassian.jira.util.ImportUtils
import com.atlassian.jira.issue.index.IssueIndexingService
import com.atlassian.jira.event.type.EventDispatchOption
import com.atlassian.jira.issue.MutableIssue

def linkMgr = ComponentAccessor.issueLinkManager
def cfManager = ComponentAccessor.customFieldManager




// CHECK TO SEE IF THE SOURCE ISSUE ALREADY HAS AN EPIC LINK
def epicLinkField = cfManager.getCustomFieldObjectsByName('Epic Link')[0]
def epicLinkValue = sourceIssue.getCustomFieldValue(epicLinkField)
log.warn(epicLinkValue)

