package org.testcontainers;

import org.testcontainers.utility.DockerImageName;

public interface SeleniumTestImages {
    DockerImageName NGINX_TEST_IMAGE = new DockerImageName("nginx:1.9.4");
}
