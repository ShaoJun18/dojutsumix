package net.mcreator.dojutsumix.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.dojutsumix.ElementsDojutsumix;

@ElementsDojutsumix.ModElement.Tag
public class ProcedureBlackfireEntityWalksOnTheBlock extends ElementsDojutsumix.ModElement {
	public ProcedureBlackfireEntityWalksOnTheBlock(ElementsDojutsumix instance) {
		super(instance, 519);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BlackfireEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.IN_FIRE, (float) 1);
	}
}
