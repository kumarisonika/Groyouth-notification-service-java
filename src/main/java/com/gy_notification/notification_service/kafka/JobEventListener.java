package com.gy_notification.notification_service.kafka;

import com.gy_notification.notification_service.event.JobApplicationEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class JobEventListener {

    @KafkaListener(topics = "job-applied", groupId = "notification-service")
    public void handleJobApplied(JobApplicationEvent event){
        System.out.println("📧 Recruiter notified:");
        System.out.println("Candidate " + event.candidateEmail + " applied for job " + event.jobId);
    }
}
