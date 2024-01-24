package MachineCoding_HLD.SocialMedia.implementation.service;

import MachineCoding_HLD.SocialMedia.implementation.model.Job;

public interface JobService {
    void addJob();
    void editJob(Job job);
    void deleteJob(Job job);
    Job getJobById(int id);
}
