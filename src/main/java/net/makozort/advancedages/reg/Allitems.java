package net.makozort.advancedages.reg;

import com.simibubi.create.AllTags;
import com.simibubi.create.content.equipment.armor.AllArmorMaterials;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.makozort.advancedages.AdvancedAges;
import net.makozort.advancedages.content.moditems.OilBucketItem;
import net.makozort.advancedages.content.moditems.PollutionDetectorItem;
import net.makozort.advancedages.content.moditems.PollutionMaskItem;
import net.makozort.advancedages.content.moditems.PollutionSpongeItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import static com.simibubi.create.AllTags.forgeItemTag;
import static net.makozort.advancedages.ModRegistrate.REGISTRATE;

public class Allitems {

    static {
        REGISTRATE.creativeModeTab(() -> ModCreativeModeTab.BIG_TAB);
    }
    public static final ItemEntry<BucketItem> CRUDE_OIL_BUCKET = REGISTRATE.item("crude_oil_bucket",
                    p -> new BucketItem(Allfluids.SOURCE_CRUDE_OIL,props().craftRemainder(Items.BUCKET).stacksTo(1)))
            .register();

    public static final ItemEntry<PollutionDetectorItem> POLLUTION_DETECTOR_ITEM = REGISTRATE.item("pollution_detector",
                    p -> new PollutionDetectorItem(props().stacksTo(1).durability(6)))
            .register();
    public static final ItemEntry<PollutionSpongeItem> POLLUTION_SPONGE = REGISTRATE.item("pollution_sponge",
                    p -> new PollutionSpongeItem(props().stacksTo(1).durability(1)))
            .register();

    public static final ItemEntry<OilBucketItem> REFINED_OIL_BUCKET = REGISTRATE.item("refined_oil_bucket",
                    p -> new OilBucketItem(Allfluids.SOURCE_REFINED_OIL,props().craftRemainder(Items.BUCKET).stacksTo(1)))
            .tag(AllTags.AllItemTags.BLAZE_BURNER_FUEL_SPECIAL.tag)
            .register();

    public static final ItemEntry<? extends PollutionMaskItem> POLLUTION_MASK = REGISTRATE.item("pollution_mask",
                    p -> new PollutionMaskItem(AllArmorMaterials.COPPER, p, AdvancedAges.asResource("pollution_mask")))
            .tag(forgeItemTag("armors/helmets"))
            .register();


    private static Item.Properties props() {
        return new Item.Properties().tab(ModCreativeModeTab.BIG_TAB.hideScroll());
    }
    public static void register() {}
}


