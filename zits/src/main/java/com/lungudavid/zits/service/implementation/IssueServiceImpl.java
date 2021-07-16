package com.lungudavid.zits.service.implementation;

import com.lungudavid.zits.model.Issue;
import com.lungudavid.zits.repository.IssueRepository;
import com.lungudavid.zits.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IssueServiceImpl implements IssueService {
    @Autowired
    private IssueRepository issueRepository;
    @Override
    public List<Issue> getAllIssues() {
        return issueRepository.findAll();
    }

    @Override
    public void addIssues(Issue issue) {
        this.issueRepository.save(issue);
    }
}
