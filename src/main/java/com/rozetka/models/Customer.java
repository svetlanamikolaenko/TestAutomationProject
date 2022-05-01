package com.rozetka.models;

public class Customer {
    private String email;
    private String password;

    public Customer() {

    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Customer(final Builder builder) {
        this.email = builder.email;
        this.password = builder.password;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private String email;
        private String password;

        private Builder() {

        }

        public Builder withEmail(final String val) {
            this.email = val;
            return this;
        }

        public Builder withPassword(final String val) {
            this.password = val;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
