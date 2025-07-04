/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package net.mcreator.dojutsumix;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.discovery.ASMDataTable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Potion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class ElementsDojutsumix implements IFuelHandler, IWorldGenerator {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<Biome>> biomes = new ArrayList<>();
	public final List<Supplier<EntityEntry>> entities = new ArrayList<>();
	public final List<Supplier<Potion>> potions = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();
	public ElementsDojutsumix() {
		sounds.put(new ResourceLocation("dojutsumix", "chakraflow"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "chakraflow")));
		sounds.put(new ResourceLocation("dojutsumix", "shukaku_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "shukaku_roar")));
		sounds.put(new ResourceLocation("dojutsumix", "amaterasu_sasuke"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "amaterasu_sasuke")));
		sounds.put(new ResourceLocation("dojutsumix", "amaterasu_itachi"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "amaterasu_itachi")));
		sounds.put(new ResourceLocation("dojutsumix", "amaterasu_sound"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "amaterasu_sound")));
		sounds.put(new ResourceLocation("dojutsumix", "bijudama"), new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "bijudama")));
		sounds.put(new ResourceLocation("dojutsumix", "byakugan1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "byakugan1")));
		sounds.put(new ResourceLocation("dojutsumix", "byakugan2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "byakugan2")));
		sounds.put(new ResourceLocation("dojutsumix", "byakugan3"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "byakugan3")));
		sounds.put(new ResourceLocation("dojutsumix", "charging_chakra"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "charging_chakra")));
		sounds.put(new ResourceLocation("dojutsumix", "chidori"), new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "chidori")));
		sounds.put(new ResourceLocation("dojutsumix", "ding"), new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "ding")));
		sounds.put(new ResourceLocation("dojutsumix", "flamethrow"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "flamethrow")));
		sounds.put(new ResourceLocation("dojutsumix", "gal_se_decopin_shot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "gal_se_decopin_shot")));
		sounds.put(new ResourceLocation("dojutsumix", "gal_se_finger_laser"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "gal_se_finger_laser")));
		sounds.put(new ResourceLocation("dojutsumix", "gal_se_groundshock"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "gal_se_groundshock")));
		sounds.put(new ResourceLocation("dojutsumix", "gal_se_hakai_charge_ground"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "gal_se_hakai_charge_ground")));
		sounds.put(new ResourceLocation("dojutsumix", "gal_se_hakai_charge_hand"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "gal_se_hakai_charge_hand")));
		sounds.put(new ResourceLocation("dojutsumix", "gal_se_hand_press"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "gal_se_hand_press")));
		sounds.put(new ResourceLocation("dojutsumix", "gal_se_nagiharai"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "gal_se_nagiharai")));
		sounds.put(new ResourceLocation("dojutsumix", "gal_se_swing"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "gal_se_swing")));
		sounds.put(new ResourceLocation("dojutsumix", "gyuki_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "gyuki_roar")));
		sounds.put(new ResourceLocation("dojutsumix", "ice_formation"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "ice_formation")));
		sounds.put(new ResourceLocation("dojutsumix", "ice_shoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "ice_shoot")));
		sounds.put(new ResourceLocation("dojutsumix", "ice_shoot_small"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "ice_shoot_small")));
		sounds.put(new ResourceLocation("dojutsumix", "isobu_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "isobu_hurt")));
		sounds.put(new ResourceLocation("dojutsumix", "isobu_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "isobu_roar")));
		sounds.put(new ResourceLocation("dojutsumix", "jutsu"), new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "jutsu")));
		sounds.put(new ResourceLocation("dojutsumix", "kagebushin"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "kagebushin")));
		sounds.put(new ResourceLocation("dojutsumix", "kamui"), new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "kamui")));
		sounds.put(new ResourceLocation("dojutsumix", "ketsu"), new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "ketsu")));
		sounds.put(new ResourceLocation("dojutsumix", "kyuubi_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "kyuubi_death")));
		sounds.put(new ResourceLocation("dojutsumix", "kyuubi_howl"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "kyuubi_howl")));
		sounds.put(new ResourceLocation("dojutsumix", "laser_long"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "laser_long")));
		sounds.put(new ResourceLocation("dojutsumix", "lightning_shoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "lightning_shoot")));
		sounds.put(new ResourceLocation("dojutsumix", "msitachi"), new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "msitachi")));
		sounds.put(new ResourceLocation("dojutsumix", "mskakashi"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "mskakashi")));
		sounds.put(new ResourceLocation("dojutsumix", "matatabi_roar1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "matatabi_roar1")));
		sounds.put(new ResourceLocation("dojutsumix", "matatabi_roar2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "matatabi_roar2")));
		sounds.put(new ResourceLocation("dojutsumix", "monstergrowl"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "monstergrowl")));
		sounds.put(new ResourceLocation("dojutsumix", "rinnegan"), new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "rinnegan")));
		sounds.put(new ResourceLocation("dojutsumix", "rinneganpower"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "rinneganpower")));
		sounds.put(new ResourceLocation("dojutsumix", "bijuu_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "bijuu_roar")));
		sounds.put(new ResourceLocation("dojutsumix", "sharingan1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "sharingan1")));
		sounds.put(new ResourceLocation("dojutsumix", "sharingan2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "sharingan2")));
		sounds.put(new ResourceLocation("dojutsumix", "swoosh"), new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "swoosh")));
		sounds.put(new ResourceLocation("dojutsumix", "waterblast"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "waterblast")));
		sounds.put(new ResourceLocation("dojutsumix", "waterfall"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "waterfall")));
		sounds.put(new ResourceLocation("dojutsumix", "waterstream"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "waterstream")));
		sounds.put(new ResourceLocation("dojutsumix", "wind"), new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "wind")));
		sounds.put(new ResourceLocation("dojutsumix", "windblast"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "windblast")));
		sounds.put(new ResourceLocation("dojutsumix", "windecho"), new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "windecho")));
		sounds.put(new ResourceLocation("dojutsumix", "sharingan3"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "sharingan3")));
		sounds.put(new ResourceLocation("dojutsumix", "amaterasu_hit"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "amaterasu_hit")));
		sounds.put(new ResourceLocation("dojutsumix", "corbeau"), new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "corbeau")));
		sounds.put(new ResourceLocation("dojutsumix", "chains1"), new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "chains1")));
		sounds.put(new ResourceLocation("dojutsumix", "senjutsu_charge"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "senjutsu_charge")));
		sounds.put(new ResourceLocation("dojutsumix", "gates_open"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "gates_open")));
		sounds.put(new ResourceLocation("dojutsumix", "genjutsu"), new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "genjutsu")));
		sounds.put(new ResourceLocation("dojutsumix", "chains2"), new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "chains2")));
		sounds.put(new ResourceLocation("dojutsumix", "hiraishin"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "hiraishin")));
		sounds.put(new ResourceLocation("dojutsumix", "jump"), new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "jump")));
		sounds.put(new ResourceLocation("dojutsumix", "kamui_short"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "kamui_short")));
		sounds.put(new ResourceLocation("dojutsumix", "kamui2"), new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "kamui2")));
		sounds.put(new ResourceLocation("dojutsumix", "demon_kcm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "demon_kcm")));
		sounds.put(new ResourceLocation("dojutsumix", "demon_chakramode"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "demon_chakramode")));
		sounds.put(new ResourceLocation("dojutsumix", "demon_open"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "demon_open")));
		sounds.put(new ResourceLocation("dojutsumix", "rocks"), new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "rocks")));
		sounds.put(new ResourceLocation("dojutsumix", "senjutsu_chargefini"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "senjutsu_chargefini")));
		sounds.put(new ResourceLocation("dojutsumix", "senjutsu_mode"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "senjutsu_mode")));
		sounds.put(new ResourceLocation("dojutsumix", "susanoo_stade1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "susanoo_stade1")));
		sounds.put(new ResourceLocation("dojutsumix", "susanoo_stade2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "susanoo_stade2")));
		sounds.put(new ResourceLocation("dojutsumix", "susanoo_stade3"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "susanoo_stade3")));
		sounds.put(new ResourceLocation("dojutsumix", "susanoo_perfect"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "susanoo_perfect")));
		sounds.put(new ResourceLocation("dojutsumix", "snake_catch"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "snake_catch")));
		sounds.put(new ResourceLocation("dojutsumix", "snake_hiss"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "snake_hiss")));
		sounds.put(new ResourceLocation("dojutsumix", "summon_die"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "summon_die")));
		sounds.put(new ResourceLocation("dojutsumix", "summon_spawn"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "summon_spawn")));
		sounds.put(new ResourceLocation("dojutsumix", "bijudama_long"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "bijudama_long")));
		sounds.put(new ResourceLocation("dojutsumix", "bijudama_explosion"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "bijudama_explosion")));
		sounds.put(new ResourceLocation("dojutsumix", "toadchant"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dojutsumix", "toadchant")));
	}

	public void preInit(FMLPreInitializationEvent event) {
		try {
			for (ASMDataTable.ASMData asmData : event.getAsmData().getAll(ModElement.Tag.class.getName())) {
				Class<?> clazz = Class.forName(asmData.getClassName());
				if (clazz.getSuperclass() == ElementsDojutsumix.ModElement.class)
					elements.add((ElementsDojutsumix.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(ElementsDojutsumix.ModElement::initElements);
		this.addNetworkMessage(DojutsumixVariables.WorldSavedDataSyncMessageHandler.class, DojutsumixVariables.WorldSavedDataSyncMessage.class,
				Side.SERVER, Side.CLIENT);
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator cg, IChunkProvider cp) {
		elements.forEach(element -> element.generateWorld(random, chunkX * 16, chunkZ * 16, world, world.provider.getDimension(), cg, cp));
	}

	@Override
	public int getBurnTime(ItemStack fuel) {
		for (ModElement element : elements) {
			int ret = element.addFuel(fuel);
			if (ret != 0)
				return ret;
		}
		return 0;
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.player.world.isRemote) {
			WorldSavedData mapdata = DojutsumixVariables.MapVariables.get(event.player.world);
			WorldSavedData worlddata = DojutsumixVariables.WorldVariables.get(event.player.world);
			if (mapdata != null)
				Dojutsumix.PACKET_HANDLER.sendTo(new DojutsumixVariables.WorldSavedDataSyncMessage(0, mapdata), (EntityPlayerMP) event.player);
			if (worlddata != null)
				Dojutsumix.PACKET_HANDLER.sendTo(new DojutsumixVariables.WorldSavedDataSyncMessage(1, worlddata), (EntityPlayerMP) event.player);
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.player.world.isRemote) {
			WorldSavedData worlddata = DojutsumixVariables.WorldVariables.get(event.player.world);
			if (worlddata != null)
				Dojutsumix.PACKET_HANDLER.sendTo(new DojutsumixVariables.WorldSavedDataSyncMessage(1, worlddata), (EntityPlayerMP) event.player);
		}
	}
	private int messageID = 0;
	public <T extends IMessage, V extends IMessage> void addNetworkMessage(Class<? extends IMessageHandler<T, V>> handler, Class<T> messageClass,
			Side... sides) {
		for (Side side : sides)
			Dojutsumix.PACKET_HANDLER.registerMessage(handler, messageClass, messageID, side);
		messageID++;
	}
	public static class GuiHandler implements IGuiHandler {
		@Override
		public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			return null;
		}

		@Override
		public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			return null;
		}
	}
	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<Biome>> getBiomes() {
		return biomes;
	}

	public List<Supplier<EntityEntry>> getEntities() {
		return entities;
	}

	public List<Supplier<Potion>> getPotions() {
		return potions;
	}
	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}
		protected final ElementsDojutsumix elements;
		protected final int sortid;
		public ModElement(ElementsDojutsumix elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLInitializationEvent event) {
		}

		public void preInit(FMLPreInitializationEvent event) {
		}

		public void generateWorld(Random random, int posX, int posZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		public void registerModels(ModelRegistryEvent event) {
		}

		public int addFuel(ItemStack fuel) {
			return 0;
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}
