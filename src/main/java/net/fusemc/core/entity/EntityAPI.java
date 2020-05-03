package net.fusemc.core.entity;

public class EntityAPI {

    private static boolean creatureSpawn;
    private static boolean creeperPower;
    private static boolean breakDoor;
    private static boolean changeblock;
    private static boolean damageByBlock;
    private static boolean damageByEntity;
    private static boolean damage;
    private static boolean death;
    private static boolean dropItem;
    private static boolean explode;
    private static boolean pickup;
    private static boolean postionEffect;

    public static boolean isBreakDoor() {
        return breakDoor;
    }

    public static boolean isChangeblock() {
        return changeblock;
    }

    public static boolean isCreatureSpawn() {
        return creatureSpawn;
    }

    public static boolean isCreeperPower() {
        return creeperPower;
    }

    public static boolean isDamage() {
        return damage;
    }

    public static boolean isDamageByBlock() {
        return damageByBlock;
    }

    public static boolean isDamageByEntity() {
        return damageByEntity;
    }

    public static boolean isDeath() {
        return death;
    }

    public static boolean isDropItem() {
        return dropItem;
    }

    public static boolean isExplode() {
        return explode;
    }

    public static boolean isPickup() {
        return pickup;
    }

    public static boolean isPostionEffect() {
        return postionEffect;
    }

    public static void setBreakDoor(boolean breakDoor) {
        EntityAPI.breakDoor = breakDoor;
    }

    public static void setChangeblock(boolean changeblock) {
        EntityAPI.changeblock = changeblock;
    }

    public static void setCreatureSpawn(boolean creatureSpawn) {
        EntityAPI.creatureSpawn = creatureSpawn;
    }

    public static void setCreeperPower(boolean creeperPower) {
        EntityAPI.creeperPower = creeperPower;
    }

    public static void setDamage(boolean damage) {
        EntityAPI.damage = damage;
    }

    public static void setDamageByBlock(boolean damageByBlock) {
        EntityAPI.damageByBlock = damageByBlock;
    }

    public static void setDamageByEntity(boolean damageByEntity) {
        EntityAPI.damageByEntity = damageByEntity;
    }

    public static void setDeath(boolean death) {
        EntityAPI.death = death;
    }

    public static void setDropItem(boolean dropItem) {
        EntityAPI.dropItem = dropItem;
    }

    public static void setExplode(boolean explode) {
        EntityAPI.explode = explode;
    }

    public static void setPickup(boolean pickup) {
        EntityAPI.pickup = pickup;
    }

    public static void setPostionEffect(boolean postionEffect) {
        EntityAPI.postionEffect = postionEffect;
    }
}
