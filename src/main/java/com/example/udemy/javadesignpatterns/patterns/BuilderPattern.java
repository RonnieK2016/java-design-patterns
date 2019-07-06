package com.example.udemy.javadesignpatterns.patterns;

public class BuilderPattern {

    private Long id;

    private String firstName;

    private String lastName;

    private String address;

    public BuilderPattern(Long id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public static BuilderPatternBuilder builder() {
        return new BuilderPatternBuilder();
    }

    static class BuilderPatternBuilder {
        private Long id;

        private String firstName;

        private String lastName;

        private String address;

        public BuilderPatternBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public BuilderPatternBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public BuilderPatternBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public BuilderPatternBuilder address(String address) {
            this.address = address;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this.id, this.firstName, this.lastName, this.address);
        }
    }
}
