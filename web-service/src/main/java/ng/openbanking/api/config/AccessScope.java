package ng.openbanking.api.config;

public enum AccessScope {

    READ_ACCOUNT("read_account", "Permission to read Account Information"),
    READ_ACCOUNT_BALANCE("read_account_balance", "Permission to read Account Balance"),
    WRITE_ACCOUNT("write_account", "Permission to create an Account");


    public static final String READ_ACCOUNT_VALUE = "read_account";


    private String name;
    private String description;

    AccessScope(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
