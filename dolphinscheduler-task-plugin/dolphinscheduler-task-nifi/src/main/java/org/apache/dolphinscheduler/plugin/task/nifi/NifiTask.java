package org.apache.dolphinscheduler.plugin.task.nifi;

import lombok.Data;
import org.apache.dolphinscheduler.spi.task.AbstractParameters;
import org.apache.dolphinscheduler.spi.task.AbstractTask;
import org.apache.dolphinscheduler.spi.task.request.TaskRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

/**
 * nifi task
 */
@Data
public class NifiTask extends AbstractTask {

    private static final String NIFI_AUTH_URL = "";
    private static final String LOAD_ALL_PROCESSOR_GROUPS = "";
    private static final String START_DATA_FLOW = "";
    private static final String END_DATA_FLOW = "";
    private static final String STATUS_OF_DATA_FLOW = "";

    /**
     * taskExecutionContext
     */
    private TaskRequest taskExecutionContext;

    private NifiParameters nifiParameters;

    public NifiTask(TaskRequest taskExecutionContext, TaskRequest taskExecutionContext1) {
        super(taskExecutionContext);
        this.taskExecutionContext = taskExecutionContext1;
    }

    @Override
    public void handle() throws Exception {

    }

    @Override
    public AbstractParameters getParameters() {
        return null;
    }

    private void testNifi() throws IOException {
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(NIFI_AUTH_URL);
        HttpResponse response = httpClient.execute(httpGet);
        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode != HttpStatus.SC_OK) {
            //
        }
    }
}
