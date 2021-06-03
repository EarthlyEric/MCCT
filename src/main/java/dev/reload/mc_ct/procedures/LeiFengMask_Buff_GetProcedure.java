package dev.reload.mc_ct.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import dev.reload.mc_ct.potion.LeiFengMaskBuffPotion;
import dev.reload.mc_ct.McCtModElements;
import dev.reload.mc_ct.McCtMod;

@McCtModElements.ModElement.Tag
public class LeiFengMask_Buff_GetProcedure extends McCtModElements.ModElement {
	public LeiFengMask_Buff_GetProcedure(McCtModElements instance) {
		super(instance, 12);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				McCtMod.LOGGER.warn("Failed to load dependency entity for procedure LeiFengMask_Buff_Get!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(LeiFengMaskBuffPotion.potion, (int) 999999999, (int) 1, (true), (true)));
	}
}
