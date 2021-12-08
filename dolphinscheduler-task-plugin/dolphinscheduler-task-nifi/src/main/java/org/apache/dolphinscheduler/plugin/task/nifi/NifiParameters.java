package org.apache.dolphinscheduler.plugin.task.nifi;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.dolphinscheduler.spi.task.AbstractParameters;
import org.apache.dolphinscheduler.spi.task.ResourceInfo;

import java.util.List;

/**
 * @author ZhangPhil
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class NifiParameters extends AbstractParameters {

    /**
     *  nifi address
     */
    private String address;
    /**
     *  nifi login username
     */
    private String username;
    /**
     *  nifi login password
     */
    private String password;
    /**
     *  nifi processor group id
     */
    private String processorGroupId;

    @Override
    public boolean checkParameters() {
        return false;
    }

    @Override
    public List<ResourceInfo> getResourceFilesList() {
        return null;
    }
}
