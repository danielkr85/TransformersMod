package fiskfille.tf.common.groundbridge;

public enum EnumError
{
    INVALID_COORDS("invalid_coords"),
    NOT_ENOUGH_SPACE("not_enough_space"),
    NO_PORTAL_LINKED("no_portal_linked"),
    PORTAL_OBSTRUCTED("portal_obstructed");

    public String displayKey;

    private EnumError(String displayKey)
    {
        this.displayKey = displayKey;
    }
}
