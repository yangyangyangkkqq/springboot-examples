package com.example.springboot;

import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.model.Job;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

/**
 * 测试jenkinsAPI
 */
public class JenkinsAPITest {

    @Test
    public void buildJob() throws URISyntaxException, IOException {
        JenkinsServer jenkinsServer=new JenkinsServer(new URI("http://jenkins.powerbridge.com:8888"),"johnyang","Powernet2019");
//        Map<String, Job> jobMap=jenkinsServer.getJobs();
//        jobMap.get("");
        jenkinsServer.getJob("dep-dispatch-build").build(true);
    }
}
