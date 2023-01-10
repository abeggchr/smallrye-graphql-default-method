package org.acme.microprofile.graphql;

public interface Person {
    default int getAge() {
        return 42;
    }
}
