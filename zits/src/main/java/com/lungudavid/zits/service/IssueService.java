package com.lungudavid.zits.service;

import com.lungudavid.zits.model.Issue;

import java.util.List;

public interface IssueService {
    List<Issue> getAllIssues();
    void addIssues(Issue issue);
}
