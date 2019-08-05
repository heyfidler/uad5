package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;

import java.util.concurrent.ExecutionException;


public class EndpointAsyncTaskTest extends ApplicationTestCase<Application> {

    public EndpointAsyncTaskTest() {
        super(Application.class);
    }

    public void testGetJokeTask() throws ExecutionException, InterruptedException {
        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask(new EndpointsAsyncTask.Callback() {
            @Override
            public void onFinished(String result) {

            }
        });
        asyncTask.execute();
        String joke = asyncTask.get();
        assertNotNull(joke);
    }
}