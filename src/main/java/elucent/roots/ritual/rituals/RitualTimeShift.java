package elucent.roots.ritual.rituals;

import java.util.ArrayList;
import java.util.List;

import elucent.roots.ritual.RitualBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RitualTimeShift extends RitualBase{
	

	
	public RitualTimeShift(String parName, double r, double g, double b, double r2, double g2, double b2){
		super(parName, r, g, b, r2, g2, b2);
	}

	@Override
	public void doEffect(World world, BlockPos pos, List<ItemStack> inventory, List<ItemStack> incenses){
		long shiftAmount = 0;
		List<Item> items = new ArrayList<Item>();
		for(ItemStack i: incenses){
			if (i.getItem() == Item.getItemFromBlock(Blocks.RED_FLOWER) && i.getMetadata() == 8){
				shiftAmount += 3000;
			}
		}
		inventory.clear();
		world.setWorldTime(world.getWorldTime() + shiftAmount);
	}

}
