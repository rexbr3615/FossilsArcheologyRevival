package fossilsarcheology.server.item;

import com.github.alexthe666.citadel.server.item.CustomArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.SoundEvent;

class FAArmorMaterial extends CustomArmorMaterial {

    protected static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private int maxDamageFactor;

    public FAArmorMaterial(String name, int durability, int[] damageReduction, int encantability, SoundEvent sound, float toughness) {
        super(name, durability, damageReduction, encantability, sound, toughness, 0);
        this.maxDamageFactor = durability;
    }

    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }
}
