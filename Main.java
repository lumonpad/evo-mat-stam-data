
import javax.swing.plaf.basic.BasicIconFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {

        //Reads inputs from "Names.txt" and sorts them into a list.
        List<String> names = new ArrayList<String>();

        Scanner reader1 = null;

        try {
            reader1 = new Scanner(new FileInputStream("src/Names.txt"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        while (reader1.hasNextLine())
        {
            names.add(reader1.nextLine());
        }
        reader1.close();

        //Reads inputs from "Stams.txt" and sorts them into a list.
        List<Double> stams = new ArrayList<Double>();

        Scanner reader2 = null;

        try {
            reader2 = new Scanner(new FileInputStream("src/Stams.txt"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        while (reader2.hasNextDouble())
        {
            stams.add(reader2.nextDouble());
        }
        reader2.close();

        //Takes the lists of names and stams inputs and uses them to create a list of BasicEvoMat objects.

        List<BasicEvoMat> basicEvoMats = new ArrayList<BasicEvoMat>();

        for (int i = 0; i < names.size(); i++)
        {
            basicEvoMats.add(new BasicEvoMat(names.get(i), stams.get(i)));
        }

        //Tuesday Dungeon
        BasicEvoMat kog = basicEvoMats.get(0);
        BasicEvoMat kor = basicEvoMats.get(1);
        BasicEvoMat kowd = basicEvoMats.get(2);
        BasicEvoMat kowt = basicEvoMats.get(3);
        BasicEvoMat kofr = basicEvoMats.get(4);
        BasicEvoMat kolt = basicEvoMats.get(5);
        BasicEvoMat kodk = basicEvoMats.get(6);

        //Wednesday Dungeon
        BasicEvoMat absm = basicEvoMats.get(7);
        BasicEvoMat agsm = basicEvoMats.get(8);
        BasicEvoMat mm = basicEvoMats.get(9);
        BasicEvoMat frem = basicEvoMats.get(10);
        BasicEvoMat wtem = basicEvoMats.get(11);
        BasicEvoMat wdem = basicEvoMats.get(12);
        BasicEvoMat ltem = basicEvoMats.get(13);
        BasicEvoMat dkem = basicEvoMats.get(14);
        BasicEvoMat frdm = basicEvoMats.get(15);
        BasicEvoMat wtdm = basicEvoMats.get(16);
        BasicEvoMat wddm = basicEvoMats.get(17);
        BasicEvoMat ltdm = basicEvoMats.get(18);
        BasicEvoMat dkdm = basicEvoMats.get(19);
        BasicEvoMat frdem = basicEvoMats.get(20);
        BasicEvoMat wtdem = basicEvoMats.get(21);
        BasicEvoMat wddem = basicEvoMats.get(22);
        BasicEvoMat ltdem = basicEvoMats.get(23);
        BasicEvoMat dkdem = basicEvoMats.get(24);

        //Thursday Dungeon
        BasicEvoMat frdf = basicEvoMats.get(25);
        BasicEvoMat wtdf = basicEvoMats.get(26);
        BasicEvoMat wddf = basicEvoMats.get(27);
        BasicEvoMat ds = basicEvoMats.get(28);
        BasicEvoMat dp = basicEvoMats.get(29);
        BasicEvoMat dfl = basicEvoMats.get(30);
        BasicEvoMat df = basicEvoMats.get(31);

        //Friday Dungeon
        BasicEvoMat anglt = basicEvoMats.get(32);
        BasicEvoMat devlt = basicEvoMats.get(33);
        BasicEvoMat rbdlt = basicEvoMats.get(34);
        BasicEvoMat rblt = basicEvoMats.get(35);
        BasicEvoMat frlt = basicEvoMats.get(36);
        BasicEvoMat wtlt = basicEvoMats.get(37);
        BasicEvoMat wdlt = basicEvoMats.get(38);
        BasicEvoMat ltlt = basicEvoMats.get(39);
        BasicEvoMat dklt = basicEvoMats.get(40);
        BasicEvoMat frdlt = basicEvoMats.get(41);
        BasicEvoMat wtdlt = basicEvoMats.get(42);
        BasicEvoMat wddlt = basicEvoMats.get(43);
        BasicEvoMat ltdlt = basicEvoMats.get(44);
        BasicEvoMat dkdlt = basicEvoMats.get(45);

        //Jewels
        BasicEvoMat frj = basicEvoMats.get(46);
        BasicEvoMat wtj = basicEvoMats.get(47);
        BasicEvoMat wdj = basicEvoMats.get(48);
        BasicEvoMat ltj = basicEvoMats.get(49);
        BasicEvoMat dkj = basicEvoMats.get(50);

        //EKMD
        BasicEvoMat ekmd = basicEvoMats.get(51);

        //Radar Dragons
        BasicEvoMat hepdra = basicEvoMats.get(52);
        BasicEvoMat ndra = basicEvoMats.get(53);
        BasicEvoMat gdra = basicEvoMats.get(54);
        BasicEvoMat zdra = basicEvoMats.get(55);
        BasicEvoMat herdra = basicEvoMats.get(56);

        //Dragon Callers
        BasicEvoMat dc5 = basicEvoMats.get(57);
        BasicEvoMat dc8g = basicEvoMats.get(58);
        BasicEvoMat dc8a = basicEvoMats.get(59);
        BasicEvoMat dc9 = basicEvoMats.get(60);

        //Numens
        BasicEvoMat frnm = basicEvoMats.get(61);
        BasicEvoMat wtnm = basicEvoMats.get(62);
        BasicEvoMat wdnm = basicEvoMats.get(63);
        BasicEvoMat ltnm = basicEvoMats.get(64);
        BasicEvoMat dknm = basicEvoMats.get(65);

        //Super Kings
        BasicEvoMat skfr = basicEvoMats.get(66);
        BasicEvoMat skwt = basicEvoMats.get(67);
        BasicEvoMat skwd = basicEvoMats.get(68);
        BasicEvoMat sklt = basicEvoMats.get(69);
        BasicEvoMat skdk = basicEvoMats.get(70);


        //Large Fire Gems

        //Red Ring Sorceress, Theurgia
        BasicEvoMat theurgia = new BasicEvoMat("Red Grimoire, Theurgia", 25);

        List<BasicEvoMat> evomatTheurgia = new ArrayList<BasicEvoMat>();

        evomatTheurgia.add(theurgia);
        evomatTheurgia.add(kofr);
        evomatTheurgia.add(kowt);
        evomatTheurgia.add(frlt);
        evomatTheurgia.add(wtlt);
        evomatTheurgia.add(rblt);

        Gem largeFireGemTheurgia = new Gem("Large Fire Gem (Red Ring Sorceress, Theurgia)", evomatTheurgia, 707107);

        //Awoken Sphinx
        BasicEvoMat sphinx = new BasicEvoMat("Sphinx", 25);

        List<BasicEvoMat> evomatSphinx = new ArrayList<BasicEvoMat>();

        evomatSphinx.add(sphinx);
        evomatSphinx.add(kofr);
        evomatSphinx.add(kor);
        evomatSphinx.add(frdlt);
        evomatSphinx.add(ltdlt);
        evomatSphinx.add(rbdlt);

        Gem largeFireGemSphinx = new Gem("Large Fire Gem (Awoken Sphinx)", evomatSphinx, 707107);

        //Gluttonous Mystic, Zhu Bajie
        BasicEvoMat zhuBajie = new BasicEvoMat("Zhu Bajie", 25);

        List<BasicEvoMat> evomatZhuBajie = new ArrayList<BasicEvoMat>();

        evomatZhuBajie.add(zhuBajie);
        evomatZhuBajie.add(kofr);
        evomatZhuBajie.add(frdm);
        evomatZhuBajie.add(frdlt);
        evomatZhuBajie.add(ltdlt);
        evomatZhuBajie.add(rbdlt);

        Gem largeFireGemZhuBajie = new Gem("Large Fire Gem (Gluttonous Mystic, Zhu Bajie)", evomatZhuBajie, 707107);

        //Awoken Surtr
        BasicEvoMat surtr = new BasicEvoMat("Surtr", 25);

        List<BasicEvoMat> evomatSurtr = new ArrayList<BasicEvoMat>();

        evomatSurtr.add(surtr);
        evomatSurtr.add(kofr);
        evomatSurtr.add(kodk);
        evomatSurtr.add(frdm);
        evomatSurtr.add(frdlt);
        evomatSurtr.add(rbdlt);

        Gem largeFireGemSurtr = new Gem("Large Fire Gem (Awoken Surtr)", evomatSurtr, 883883);

        //Awoken Hephaestus
        BasicEvoMat hephaestus = new BasicEvoMat("Hephaestus", 25);

        List<BasicEvoMat> evomatHephaestus = new ArrayList<BasicEvoMat>();

        evomatHephaestus.add(hephaestus);
        evomatHephaestus.add(kofr);
        evomatHephaestus.add(kofr);
        evomatHephaestus.add(frdlt);
        evomatHephaestus.add(frdlt);
        evomatHephaestus.add(rbdlt);

        Gem largeFireGemHephaestus = new Gem("Large Fire Gem (Awoken Hephaestus)", evomatHephaestus, 883883);

        //Flamewing Twin Dragon King, Wangren
        BasicEvoMat wangren = new BasicEvoMat("Twin Dragon, Wangren", 176);

        List<BasicEvoMat> evomatWangren = new ArrayList<BasicEvoMat>();

        evomatWangren.add(wangren);
        evomatWangren.add(skfr);
        evomatWangren.add(dfl);
        evomatWangren.add(df);
        evomatWangren.add(frdlt);
        evomatWangren.add(rbdlt);

        Gem largeFireGemWangren = new Gem("Large Fire Gem (Flamewing Twin Dragon King, Wangren)", evomatWangren, 707107);

        //Red Mech General, Elder Jotunn
        BasicEvoMat jotunn = new BasicEvoMat("Flame Mech Warrior, Jotunn", 50);

        List<BasicEvoMat> evomatJotunn = new ArrayList<BasicEvoMat>();

        evomatJotunn.add(jotunn);
        evomatJotunn.add(kog);
        evomatJotunn.add(kog);
        evomatJotunn.add(kog);
        evomatJotunn.add(frdlt);
        evomatJotunn.add(rbdlt);

        Gem largeFireGemJotunn = new Gem("Large Fire Gem (Red Mech General, Elder Jotunn)", evomatJotunn, 0);

        //Comparing all options for a Large Fire Gem.
        List<Gem> largeFireGems = new ArrayList<Gem>();

        largeFireGems.add(largeFireGemTheurgia);
        largeFireGems.add(largeFireGemSphinx);
        largeFireGems.add(largeFireGemZhuBajie);
        largeFireGems.add(largeFireGemSurtr);
        largeFireGems.add(largeFireGemHephaestus);
        largeFireGems.add(largeFireGemWangren);
        largeFireGems.add(largeFireGemJotunn);

        BasicEvoMat lgFrGm = new BasicEvoMat("Large Fire Gem", 0);

        compareElementGems(largeFireGems, lgFrGm);

        //Large Water Gems

        //Icewing Twin Dragon King, Beyzul
        BasicEvoMat beyzul = new BasicEvoMat("Twin Dragon, Beyzul", 176);

        List<BasicEvoMat> evomatBeyzul = new ArrayList<BasicEvoMat>();

        evomatBeyzul.add(beyzul);
        evomatBeyzul.add(skwt);
        evomatBeyzul.add(dfl);
        evomatBeyzul.add(df);
        evomatBeyzul.add(wtdlt);
        evomatBeyzul.add(rbdlt);

        Gem largeWaterGemBeyzul = new Gem("Large Water Gem (Icewing Twin Dragon King, Beyzul)", evomatBeyzul, 707107);

        //Blue Mech General, Mar Midgard
        BasicEvoMat midgard = new BasicEvoMat("Water Mech Warrior, Midgard", 25);

        List<BasicEvoMat> evomatMidgard = new ArrayList<BasicEvoMat>();

        evomatMidgard.add(midgard);
        evomatMidgard.add(kog);
        evomatMidgard.add(kog);
        evomatMidgard.add(kog);
        evomatMidgard.add(wtdlt);
        evomatMidgard.add(rbdlt);

        Gem largeWaterGemMidgard = new Gem("Large Water Gem (Blue Mech General, Mar Midgard)", evomatMidgard, 0);

        //Blue Time Sorceress, Ars Paulina
        BasicEvoMat arsPaulina = new BasicEvoMat("Blue Grimoire, Ars Paulina", 25);

        List<BasicEvoMat> evomatArsPaulina = new ArrayList<BasicEvoMat>();

        evomatArsPaulina.add(arsPaulina);
        evomatArsPaulina.add(kowt);
        evomatArsPaulina.add(kowd);
        evomatArsPaulina.add(wtlt);
        evomatArsPaulina.add(wdlt);
        evomatArsPaulina.add(rblt);

        Gem largeWaterGemArsPaulina = new Gem("Large Water Gem (Blue Time Sorceress, Ars Paulina)", evomatArsPaulina, 707107);

        //Graceful General, Zhou Yu
        BasicEvoMat zhouYu = new BasicEvoMat("Zhou Yu", 25);

        List<BasicEvoMat> evomatZhouYu = new ArrayList<BasicEvoMat>();

        evomatZhouYu.add(zhouYu);
        evomatZhouYu.add(kowt);
        evomatZhouYu.add(kowd);
        evomatZhouYu.add(wtdm);
        evomatZhouYu.add(wtdlt);
        evomatZhouYu.add(rbdlt);

        Gem largeWaterGemZhouYu = new Gem("Large Water Gem (Graceful General, Zhou Yu)", evomatZhouYu, 1663863);

        //Liusha River Mystic, Sha Wujing
        BasicEvoMat shaWujing = new BasicEvoMat("Sha Wujing", 25);

        List<BasicEvoMat> evomatShaWujing = new ArrayList<BasicEvoMat>();

        evomatShaWujing.add(shaWujing);
        evomatShaWujing.add(kowt);
        evomatShaWujing.add(wtdm);
        evomatShaWujing.add(wtdlt);
        evomatShaWujing.add(dkdlt);
        evomatShaWujing.add(rbdlt);

        Gem largeWaterGemShaWujing = new Gem("Large Water Gem (Liusha River Mystic, Sha Wujing)", evomatShaWujing, 707107);

        //Cruel Frozen Hell Demon, Indigo
        BasicEvoMat indigo = new BasicEvoMat("Frozen Hell Demon, Indigo", 25);

        List<BasicEvoMat> evomatIndigo = new ArrayList<BasicEvoMat>();

        evomatIndigo.add(indigo);
        evomatIndigo.add(kowt);
        evomatIndigo.add(kor);
        evomatIndigo.add(wtdm);
        evomatIndigo.add(wtdlt);
        evomatIndigo.add(rbdlt);

        Gem largeWaterGemIndigo = new Gem("Large Water Gem (Cruel Frozen Hell Demon, Indigo)", evomatIndigo, 883883);

        //Awoken Aegir
        BasicEvoMat aegir = new BasicEvoMat("Aegir", 25);

        List<BasicEvoMat> evomatAegir = new ArrayList<BasicEvoMat>();

        evomatAegir.add(aegir);
        evomatAegir.add(kowt);
        evomatAegir.add(kor);
        evomatAegir.add(wtdlt);
        evomatAegir.add(wddlt);
        evomatAegir.add(rbdlt);

        Gem largeWaterGemAegir = new Gem("Large Water Gem (Awoken Aegir)", evomatAegir, 883883);

        //Comparing all options for a Large Water Gem.
        List<Gem> largeWaterGems = new ArrayList<Gem>();

        largeWaterGems.add(largeWaterGemBeyzul);
        largeWaterGems.add(largeWaterGemMidgard);
        largeWaterGems.add(largeWaterGemArsPaulina);
        largeWaterGems.add(largeWaterGemZhouYu);
        largeWaterGems.add(largeWaterGemShaWujing);
        largeWaterGems.add(largeWaterGemIndigo);
        largeWaterGems.add(largeWaterGemAegir);

        BasicEvoMat lgWtGm = new BasicEvoMat("Large Water Gem", 0);

        compareElementGems(largeWaterGems, lgWtGm);

        //Large Wood Gems

        //Green Mech General, Viz Asgard
        BasicEvoMat asgard = new BasicEvoMat("Wood Mech Warrior, Asgard", 25);

        List<BasicEvoMat> evomatAsgard = new ArrayList<BasicEvoMat>();

        evomatAsgard.add(asgard);
        evomatAsgard.add(kog);
        evomatAsgard.add(kog);
        evomatAsgard.add(kog);
        evomatAsgard.add(wddlt);
        evomatAsgard.add(rbdlt);

        Gem largeWoodGemAsgard = new Gem("Large Wood Gem (Green Mech General, Viz Asgard)", evomatAsgard, 0);

        //Stormwing Dragon Emperor, Threedia
        BasicEvoMat threedia = new BasicEvoMat("Swift Dragon Emperor, Threedia", 44);

        List<BasicEvoMat> evomatThreedia = new ArrayList<BasicEvoMat>();

        evomatThreedia.add(threedia);
        evomatThreedia.add(skwd);
        evomatThreedia.add(dfl);
        evomatThreedia.add(df);
        evomatThreedia.add(ltdlt);
        evomatThreedia.add(rbdlt);

        Gem largeWoodGemThreedia = new Gem("Large Wood Gem (Stormwing Dragon Emperor, Threedia", evomatThreedia, 883883);

        //Chivalric Demon Prince, Cauchemar
        BasicEvoMat cauchemar = new BasicEvoMat("Cauchemar", 25);

        List<BasicEvoMat> evomatCauchemar = new ArrayList<BasicEvoMat>();

        evomatCauchemar.add(cauchemar);
        evomatCauchemar.add(kowd);
        evomatCauchemar.add(wddm);
        evomatCauchemar.add(dkdm);
        evomatCauchemar.add(wdj);
        evomatCauchemar.add(dkj);

        Gem largeWoodGemCauchemar = new Gem("Large Wood Gem (Chivalric Demon Prince, Cauchemar)", evomatCauchemar, 1663863);

        //Mighty Dragon General, Zhao Yun
        BasicEvoMat zhaoYun = new BasicEvoMat("Zhao Yun", 25);

        List<BasicEvoMat> evomatZhaoYun = new ArrayList<BasicEvoMat>();

        evomatZhaoYun.add(zhaoYun);
        evomatZhaoYun.add(kowd);
        evomatZhaoYun.add(wddm);
        evomatZhaoYun.add(df);
        evomatZhaoYun.add(ltdlt);
        evomatZhaoYun.add(rbdlt);

        Gem largeWoodGemZhaoYun = new Gem("Large Wood Gem (Mighty Dragon General, Zhao Yun)", evomatZhaoYun, 1663863);

        //Green Essence Sorceress, Almadel
        BasicEvoMat almadel = new BasicEvoMat("Green Grimoire, Almadel", 25);

        List<BasicEvoMat> evomatAlmadel = new ArrayList<BasicEvoMat>();

        evomatAlmadel.add(almadel);
        evomatAlmadel.add(kowd);
        evomatAlmadel.add(kofr);
        evomatAlmadel.add(wdlt);
        evomatAlmadel.add(frlt);
        evomatAlmadel.add(rblt);

        Gem largeWoodGemAlmadel = new Gem("Large Wood Gem (Green Essence Sorceress, Almadel)", evomatAlmadel, 707107);

        //Guardian of Dark Riches, Medjedra
        BasicEvoMat medjedra = new BasicEvoMat("Medjedra", 25);

        List<BasicEvoMat> evomatMedjedra = new ArrayList<BasicEvoMat>();

        evomatMedjedra.add(medjedra);
        evomatMedjedra.add(kowd);
        evomatMedjedra.add(kowd);
        evomatMedjedra.add(wddm);
        evomatMedjedra.add(frdlt);
        evomatMedjedra.add(rbdlt);

        Gem largeWoodGemMedjedra = new Gem("Large Wood Gem (Guardian of Dark Riches, Medjedra)", evomatMedjedra, 707107);

        //Bamboo Cutter's Blossom, Kaguya-Hime
        BasicEvoMat kaguyaHime = new BasicEvoMat("Kaguya-Hime", 25);

        List<BasicEvoMat> evomatLargeWoodGemKaguyaHime = new ArrayList<BasicEvoMat>();

        evomatLargeWoodGemKaguyaHime.add(kaguyaHime);
        evomatLargeWoodGemKaguyaHime.add(kowd);
        evomatLargeWoodGemKaguyaHime.add(kolt);
        evomatLargeWoodGemKaguyaHime.add(wddm);
        evomatLargeWoodGemKaguyaHime.add(ltdlt);
        evomatLargeWoodGemKaguyaHime.add(rbdlt);

        Gem largeWoodGemKaguyaHime = new Gem("Large Wood Gem (Bamboo Cutter's Blossom, Kaguya-Hime)", evomatLargeWoodGemKaguyaHime, 707107);

        //Black Beast Demon's Servant, Aamir
        BasicEvoMat aamir = new BasicEvoMat("Aamir", 25);

        List<BasicEvoMat> evomatLargeWoodGemAamir = new ArrayList<BasicEvoMat>();

        evomatLargeWoodGemAamir.add(aamir);
        evomatLargeWoodGemAamir.add(kowd);
        evomatLargeWoodGemAamir.add(kodk);
        evomatLargeWoodGemAamir.add(dkdlt);
        evomatLargeWoodGemAamir.add(wddlt);
        evomatLargeWoodGemAamir.add(rbdlt);

        Gem largeWoodGemAamir = new Gem("Large Wood Gem (Black Beast Demon's Servant, Aamir)", evomatLargeWoodGemAamir, 707107);

        //Relentless Destroyer, Great Tengu
        BasicEvoMat tengu = new BasicEvoMat("Twisted Mountain God, Great Tengu", 50);

        List<BasicEvoMat> evomatTengu = new ArrayList<BasicEvoMat>();

        evomatTengu.add(tengu);
        evomatTengu.add(kowd);
        evomatTengu.add(kodk);
        evomatTengu.add(kor);
        evomatTengu.add(wddm);
        evomatTengu.add(wddlt);

        Gem largeWoodGemTengu = new Gem("Large Wood Gem (Relentless Destroyer, Great Tengu)", evomatTengu, 0);

        //Awoken Jord
        BasicEvoMat jord = new BasicEvoMat("Jord", 25);

        List<BasicEvoMat> evomatJord = new ArrayList<BasicEvoMat>();

        evomatJord.add(jord);
        evomatJord.add(kowd);
        evomatJord.add(kolt);
        evomatJord.add(wddm);
        evomatJord.add(ltdlt);
        evomatJord.add(rbdlt);

        Gem largeWoodGemJord = new Gem("Large Wood Gem (Awoken Jord)", evomatJord, 883883);

        //Awoken Yamatsumi
        BasicEvoMat yamatsumi = new BasicEvoMat("Yamatsumi", 25);

        List<BasicEvoMat> evomatYamatsumi = new ArrayList<BasicEvoMat>();

        evomatYamatsumi.add(yamatsumi);
        evomatYamatsumi.add(kowd);
        evomatYamatsumi.add(kowd);
        evomatYamatsumi.add(kowd);
        evomatYamatsumi.add(ltdlt);
        evomatYamatsumi.add(rbdlt);

        Gem largeWoodGemYamatsumi = new Gem("Large Wood Gem (Awoken Yamatsumi)", evomatYamatsumi, 883883);

        //Comparing all options for a Large Wood Gem
        List<Gem> largeWoodGems = new ArrayList<Gem>();

        largeWoodGems.add(largeWoodGemAsgard);
        largeWoodGems.add(largeWoodGemThreedia);
        largeWoodGems.add(largeWoodGemCauchemar);
        largeWoodGems.add(largeWoodGemZhaoYun);
        largeWoodGems.add(largeWoodGemAlmadel);
        largeWoodGems.add(largeWoodGemMedjedra);
        largeWoodGems.add(largeWoodGemKaguyaHime);
        largeWoodGems.add(largeWoodGemAamir);
        largeWoodGems.add(largeWoodGemTengu);
        largeWoodGems.add(largeWoodGemJord);
        largeWoodGems.add(largeWoodGemYamatsumi);

        BasicEvoMat lgWdGm = new BasicEvoMat("Large Wood Gem", 0);

        compareElementGems(largeWoodGems, lgWdGm);

        //Large Light Gems

        //Awoken Zeus Olympios
        BasicEvoMat ltZeus = new BasicEvoMat("Awoken Zeus", 50);

        List<BasicEvoMat> evomatLtZeus = new ArrayList<BasicEvoMat>();

        evomatLtZeus.add(ltZeus);
        evomatLtZeus.add(sklt);
        evomatLtZeus.add(sklt);
        evomatLtZeus.add(anglt);
        evomatLtZeus.add(anglt);
        evomatLtZeus.add(anglt);

        Gem largeLightGemLtZeus = new Gem("Large Light Gem (Awoken Zeus Olympios)", evomatLtZeus, 707107);

        //Awoken Sandalphon
        BasicEvoMat sandalphon = new BasicEvoMat("Sandalphon", 25);

        List<BasicEvoMat> evomatLargeLightGemSandalphon = new ArrayList<BasicEvoMat>();

        evomatLargeLightGemSandalphon.add(sandalphon);
        evomatLargeLightGemSandalphon.add(kolt);
        evomatLargeLightGemSandalphon.add(kor);
        evomatLargeLightGemSandalphon.add(mm);
        evomatLargeLightGemSandalphon.add(wtdlt);
        evomatLargeLightGemSandalphon.add(rbdlt);

        Gem largeLightGemSandalphon = new Gem("Large Light Gem (Awoken Sandalphon)", evomatLargeLightGemSandalphon, 883883);

        //Gleaming-Eyed Dragon Monk, Xuanzang
        BasicEvoMat ltXuanzang  = new BasicEvoMat("Shining Monk, Xuanzang", 25);

        List<BasicEvoMat> evomatLtXuanzang = new ArrayList<>();

        evomatLtXuanzang.add(ltXuanzang);
        evomatLtXuanzang.add(kolt);
        evomatLtXuanzang.add(ltdm);
        evomatLtXuanzang.add(ltdlt);
        evomatLtXuanzang.add(ltdlt);
        evomatLtXuanzang.add(rbdlt);

        Gem largeLightGemLtXuanzang = new Gem("Large Light Gem (Gleaming-Eyed Dragon Monk, Xuanzang)", evomatLtXuanzang, 707107);

        //Awoken Mephistopheles
        BasicEvoMat mephistopheles = new BasicEvoMat("Mephistopheles", 25);

        List<BasicEvoMat> evomatMephistopheles = new ArrayList<BasicEvoMat>();

        evomatMephistopheles.add(mephistopheles);
        evomatMephistopheles.add(kolt);
        evomatMephistopheles.add(ltdm);
        evomatMephistopheles.add(ltdlt);
        evomatMephistopheles.add(dkdlt);
        evomatMephistopheles.add(rbdlt);

        Gem largeLightGemMephistopheles = new Gem("Large Light Gem (Awoken Mephistopheles)", evomatMephistopheles, 883883);

        //Honorable Dragon, Kanetsugu
        BasicEvoMat kanetsugu = new BasicEvoMat("Noble Dragon, Yoroku", 25);

        List<BasicEvoMat> evomatKanetsugu = new ArrayList<BasicEvoMat>();

        evomatKanetsugu.add(kanetsugu);
        evomatKanetsugu.add(mm);
        evomatKanetsugu.add(df);
        evomatKanetsugu.add(ltdlt);
        evomatKanetsugu.add(ltdlt);
        evomatKanetsugu.add(rbdlt);

        Gem largeLightGemKanetsugu = new Gem("Large Light Gem (Honorable Dragon, Kanetsugu)", evomatKanetsugu, 707107);

        //Dark Sky Star Dragon Emperor, Defoud
        BasicEvoMat defoud = new BasicEvoMat("Star Dragon Emperor, Defoud", 50);

        List<BasicEvoMat> evomatDefoud = new ArrayList<BasicEvoMat>();

        evomatDefoud.add(defoud);
        evomatDefoud.add(sklt);
        evomatDefoud.add(df);
        evomatDefoud.add(ltdlt);
        evomatDefoud.add(dkdlt);
        evomatDefoud.add(rbdlt);

        Gem largeLightGemDefoud = new Gem("Large Light Gem (Dark Sky Star Dragon Emperor, Defoud)", evomatDefoud, 883883);

        //Awoken Deus ex Machina
        BasicEvoMat deusExMachina = new BasicEvoMat("Deus ex Machina", 25);

        List<BasicEvoMat> evomatDeusExMachina = new ArrayList<BasicEvoMat>();

        evomatDeusExMachina.add(deusExMachina);
        evomatDeusExMachina.add(kolt);
        evomatDeusExMachina.add(kodk);
        evomatDeusExMachina.add(kor);
        evomatDeusExMachina.add(mm);
        evomatDeusExMachina.add(rbdlt);

        Gem largeLightGemDeusExMachina = new Gem("Large Light Gem (Awoken Deus ex Machina)", evomatDeusExMachina, 883883);

        //Awoken Heimdallr
        BasicEvoMat heimdallr = new BasicEvoMat("Heimdallr", 25);

        List<BasicEvoMat> evomatHeimdallr = new ArrayList<BasicEvoMat>();

        evomatHeimdallr.add(heimdallr);
        evomatHeimdallr.add(kolt);
        evomatHeimdallr.add(kowt);
        evomatHeimdallr.add(ltdm);
        evomatHeimdallr.add(wtdlt);
        evomatHeimdallr.add(rbdlt);
        Gem largeLightGemHeimdallr = new Gem("Large Light Gem (Awoken Heimdallr)", evomatHeimdallr, 883883);

        //Holy Night Messenger, Santa Claus
        BasicEvoMat santaClaus = new BasicEvoMat("Santa Claus", 25);

        List<BasicEvoMat> evomatSantaClaus = new ArrayList<BasicEvoMat>();

        evomatSantaClaus.add(santaClaus);
        evomatSantaClaus.add(kolt);
        evomatSantaClaus.add(mm);
        evomatSantaClaus.add(ltdlt);
        evomatSantaClaus.add(frdlt);
        evomatSantaClaus.add(rbdlt);

        Gem largeLightGemSantaClaus = new Gem("Large Light Gem (Holy Night Messenger, Santa Claus)", evomatSantaClaus, 883883);

        //Awoken Takemikazuchi
        BasicEvoMat takemikazuchi = new BasicEvoMat("Takemikazuchi", 25);

        List<BasicEvoMat> evomatTakemikazuchi = new ArrayList<BasicEvoMat>();

        evomatTakemikazuchi.add(takemikazuchi);
        evomatTakemikazuchi.add(kolt);
        evomatTakemikazuchi.add(kowt);
        evomatTakemikazuchi.add(kor);
        evomatTakemikazuchi.add(ltdm);
        evomatTakemikazuchi.add(rbdlt);

        Gem largeLightGemTakemikazuchi = new Gem("Large Light Gem (Awoken Takemikazuchi)", evomatTakemikazuchi, 883883);

        //Comparing all options for a Large Light Gem
        List<Gem> largeLightGems = new ArrayList<Gem>();

        largeLightGems.add(largeLightGemLtZeus);
        largeLightGems.add(largeLightGemSandalphon);
        largeLightGems.add(largeLightGemLtXuanzang);
        largeLightGems.add(largeLightGemMephistopheles);
        largeLightGems.add(largeLightGemKanetsugu);
        largeLightGems.add(largeLightGemDefoud);
        largeLightGems.add(largeLightGemDeusExMachina);
        largeLightGems.add(largeLightGemHeimdallr);
        largeLightGems.add(largeLightGemSantaClaus);
        largeLightGems.add(largeLightGemTakemikazuchi);

        BasicEvoMat lgLtGm = new BasicEvoMat("Large Light Gem", 0);

        compareElementGems(largeLightGems, lgLtGm);

        //Large Dark Gems

        //Awoken Zeus Stratios
        BasicEvoMat dkZeus = new BasicEvoMat("Awoken Zeus", 50);

        List<BasicEvoMat> evomatDkZeus = new ArrayList<BasicEvoMat>();

        evomatDkZeus.add(dkZeus);
        evomatDkZeus.add(skdk);
        evomatDkZeus.add(skdk);
        evomatDkZeus.add(devlt);
        evomatDkZeus.add(devlt);
        evomatDkZeus.add(devlt);

        Gem largeDarkGemDkZeus = new Gem("Large Dark Gem (Awoken Zeus Stratios)", evomatDkZeus, 0);

        //Divine Queen Hera
        BasicEvoMat hera = new BasicEvoMat("Awoken Hera", 50);

        List<BasicEvoMat> evomatHera = new ArrayList<BasicEvoMat>();

        evomatHera.add(hera);
        evomatHera.add(skdk);
        evomatHera.add(skdk);
        evomatHera.add(devlt);
        evomatHera.add(devlt);
        evomatHera.add(devlt);

        Gem largeDarkGemHera = new Gem("Large Dark Gem (Divine Queen Hera)", evomatHera, 0);

        //Maleficent Dragon Lord Zaerog
        BasicEvoMat zaerog = new BasicEvoMat("Dragon Lord Zaerog", 50);

        List<BasicEvoMat> evomatLargeDarkGemZaerog = new ArrayList<BasicEvoMat>();

        evomatLargeDarkGemZaerog.add(zaerog);
        evomatLargeDarkGemZaerog.add(skdk);
        evomatLargeDarkGemZaerog.add(frdf);
        evomatLargeDarkGemZaerog.add(wtdf);
        evomatLargeDarkGemZaerog.add(wddf);
        evomatLargeDarkGemZaerog.add(devlt);

        Gem largeDarkGemZaerog = new Gem("Large Dark Gem (Maleficent Dragon Lord Zaerog)", evomatLargeDarkGemZaerog, 0);

        //Dark-Eyed Dragon Monk, Xuanzang
        BasicEvoMat dkXuanzang = new BasicEvoMat("Shadow Monk, Xuanzang", 25);

        List<BasicEvoMat> evomatDkXuanzang = new ArrayList<BasicEvoMat>();

        evomatDkXuanzang.add(dkXuanzang);
        evomatDkXuanzang.add(kodk);
        evomatDkXuanzang.add(dkdm);
        evomatDkXuanzang.add(dkdlt);
        evomatDkXuanzang.add(dkdlt);
        evomatDkXuanzang.add(rbdlt);

        Gem largeDarkGemDkXuanzang = new Gem("Large Dark Gem (Dark-Eyed Dragon Monk, Xuanzang)", evomatDkXuanzang, 707107);

        //King of Hell, Satan
        BasicEvoMat satan = new BasicEvoMat("Satan", 25);

        List<BasicEvoMat> evomatSatan = new ArrayList<BasicEvoMat>();

        evomatSatan.add(satan);
        evomatSatan.add(kor);
        evomatSatan.add(kodk);
        evomatSatan.add(mm);
        evomatSatan.add(rbdlt);
        evomatSatan.add(wtdlt);
        evomatSatan.add(kog);
        evomatSatan.add(devlt);
        evomatSatan.add(devlt);
        evomatSatan.add(devlt);
        evomatSatan.add(devlt);

        Gem largeDarkGemSatan = new Gem("Large Dark Gem (King of Hell, Satan)", evomatSatan, 883883);

        //Awoken Hel
        BasicEvoMat hel = new BasicEvoMat("Hel", 25);

        List<BasicEvoMat> evomatHel = new ArrayList<BasicEvoMat>();

        evomatHel.add(hel);
        evomatHel.add(kodk);
        evomatHel.add(kolt);
        evomatHel.add(dkdm);
        evomatHel.add(ltdm);
        evomatHel.add(rbdlt);

        Gem largeDarkGemHel = new Gem("Large Dark Gem (Awoken Hel)", evomatHel, 883883);

        //Comparing all options for Large Dark Gem
        List<Gem> largeDarkGems = new ArrayList<Gem>();

        largeDarkGems.add(largeDarkGemDkZeus);
        largeDarkGems.add(largeDarkGemHera);
        largeDarkGems.add(largeDarkGemZaerog);
        largeDarkGems.add(largeDarkGemDkXuanzang);
        largeDarkGems.add(largeDarkGemSatan);
        largeDarkGems.add(largeDarkGemHel);

        BasicEvoMat lgDkGm = new BasicEvoMat("Large Dark Gem", 0);

        compareElementGems(largeDarkGems, lgDkGm);

        //Medium Fire Gems

        //Infernodragon Muspelheim
        BasicEvoMat infernodragonMuspelheim = new BasicEvoMat("Infernodragon Muspelheim", 50);

        List<BasicEvoMat> evomatInfernodragonMuspelheim = new ArrayList<BasicEvoMat>();

        evomatInfernodragonMuspelheim.add(infernodragonMuspelheim);

        Gem mediumFireGemInfernodragonMuspelheim = new Gem("Medium Fire Gem (Infernodragon Muspelheim)", evomatInfernodragonMuspelheim, 0);

        //Goemon, the Thief
        BasicEvoMat goemon = new BasicEvoMat("Ishikawa Goemon", 25);

        List<BasicEvoMat> evomatMediumFireGemGoemon = new ArrayList<BasicEvoMat>();

        evomatMediumFireGemGoemon.add(goemon);
        evomatMediumFireGemGoemon.add(frdem);
        evomatMediumFireGemGoemon.add(frdm);
        evomatMediumFireGemGoemon.add(frdlt);
        evomatMediumFireGemGoemon.add(kofr);
        evomatMediumFireGemGoemon.add(kor);

        Gem mediumFireGemGoemon = new Gem("Medium Fire Gem (Goemon, the Thief)", evomatMediumFireGemGoemon, 707107);

        //Awoken Hera-Ur
        BasicEvoMat heraUr = new BasicEvoMat("Hera-Ur", 25);

        List<BasicEvoMat> evomatMediumFireGemHeraUr = new ArrayList<BasicEvoMat>();

        evomatMediumFireGemHeraUr.add(heraUr);
        evomatMediumFireGemHeraUr.add(rbdlt);
        evomatMediumFireGemHeraUr.add(frdm);
        evomatMediumFireGemHeraUr.add(mm);
        evomatMediumFireGemHeraUr.add(kofr);
        evomatMediumFireGemHeraUr.add(kor);

        Gem mediumFireGemHeraUr = new Gem("Medium Fire Gem (Awoken Hera-Ur)", evomatMediumFireGemHeraUr, 883883);

        //Omega Red Skydragon, El Dorado
        BasicEvoMat elDorado = new BasicEvoMat("Omega Red Skydragon, El Dorado", 25);

        List<BasicEvoMat> evomatElDorado = new ArrayList<BasicEvoMat>();

        evomatElDorado.add(elDorado);

        Gem mediumFireGemElDorado = new Gem("Medium Fire Gem (Omega Red Skydragon, El Dorado)", evomatElDorado, 0);

        //Awoken Zeus Vulcan
        BasicEvoMat zeusVulcan = new BasicEvoMat("Zeus Vulcan", 25);

        List<BasicEvoMat> evomatMediumFireGemZeusVulcan = new ArrayList<BasicEvoMat>();

        evomatMediumFireGemZeusVulcan.add(zeusVulcan);
        evomatMediumFireGemZeusVulcan.add(kofr);
        evomatMediumFireGemZeusVulcan.add(kor);
        evomatMediumFireGemZeusVulcan.add(mm);
        evomatMediumFireGemZeusVulcan.add(frdlt);
        evomatMediumFireGemZeusVulcan.add(rbdlt);

        Gem mediumFireGemZeusVulcan = new Gem("Medium Fire Gem (Awoken Zeus Vulcan)", evomatMediumFireGemZeusVulcan, 883883);

        //Peach Garden General, Guan Yinping
        BasicEvoMat guanYinping = new BasicEvoMat("Guan Yinping", 25);

        List<BasicEvoMat> evomatGuanYinping = new ArrayList<BasicEvoMat>();

        evomatGuanYinping.add(guanYinping);
        evomatGuanYinping.add(kofr);
        evomatGuanYinping.add(frdm);
        evomatGuanYinping.add(df);
        evomatGuanYinping.add(frdlt);
        evomatGuanYinping.add(rbdlt);

        Gem mediumFireGemGuanYinping = new Gem("Medium Fire Gem (Guan Yinping)", evomatGuanYinping, 707107);

        //Purifying Thunder Dragon, Sedin
        BasicEvoMat sedin = new BasicEvoMat("Purifying Thunder Dragon, Sedin", 25);

        List<BasicEvoMat> evomatSedin = new ArrayList<BasicEvoMat>();

        evomatSedin.add(sedin);

        Gem mediumFireGemSedin = new Gem("Medium Fire Gem (Purifying Thunder Dragon, Sedin)", evomatSedin, 0);

        //Scarlet Sky Ruler, Yamato Takeru Dragon
        BasicEvoMat yamatoTakeruDragon = new BasicEvoMat("Scarlet Sky Ruler, Yamato Takeru Dragon", 25);

        List<BasicEvoMat> evomatYamatoTakeruDragon = new ArrayList<BasicEvoMat>();

        evomatYamatoTakeruDragon.add(yamatoTakeruDragon);

        Gem mediumFireGemYamatoTakeruDragon = new Gem("Medium Fire Gem (Scarlet Sky Ruler, Yamato Takeru Dragon)", evomatYamatoTakeruDragon, 0);

        //Fire Guardian Dragon, Touen
        BasicEvoMat touen = new BasicEvoMat("Fire Guardian Dragon, Touen", 25);

        List<BasicEvoMat> evomatTouen = new ArrayList<BasicEvoMat>();

        evomatTouen.add(touen);

        Gem mediumFireGemTouen = new Gem("Medium Fire Gem (Fire Guardian Dragon, Touen)", evomatTouen, 0);

        //Fire Orb Dragon, Kajin
        BasicEvoMat kajin = new BasicEvoMat("Fire Orb Dragon, Kajin", 25);

        List<BasicEvoMat> evomatKajin = new ArrayList<BasicEvoMat>();

        evomatKajin.add(kajin);

        Gem mediumFireGemKajin = new Gem("Medium Fire Gem (Fire Orb Dragon, Kajin)", evomatKajin, 0);

        //Fire Warchief Dragon, Goura
        BasicEvoMat goura = new BasicEvoMat("Fire Warchief Dragon, Goura", 25);

        List<BasicEvoMat> evomatGoura = new ArrayList<BasicEvoMat>();

        evomatGoura.add(goura);

        Gem mediumFireGemGoura = new Gem("Medium Fire Gem (Fire Warchief Dragon, Goura)", evomatGoura, 0);

        //Comparing all options for Medium Fire Gem

        List<Gem> mediumFireGems = new ArrayList<Gem>();

        mediumFireGems.add(mediumFireGemInfernodragonMuspelheim);
        mediumFireGems.add(mediumFireGemGoemon);
        mediumFireGems.add(mediumFireGemHeraUr);
        mediumFireGems.add(mediumFireGemElDorado);
        mediumFireGems.add(mediumFireGemZeusVulcan);
        mediumFireGems.add(mediumFireGemGuanYinping);
        mediumFireGems.add(mediumFireGemSedin);
        mediumFireGems.add(mediumFireGemYamatoTakeruDragon);
        mediumFireGems.add(mediumFireGemTouen);
        mediumFireGems.add(mediumFireGemKajin);
        mediumFireGems.add(mediumFireGemGoura);

        BasicEvoMat mdFrGm = new BasicEvoMat("Medium Fire Gem", 0);

        compareElementGems(mediumFireGems, mdFrGm);

        BasicEvoMat mdWtGm = new BasicEvoMat("Medium Water Gem", 25.0);
        BasicEvoMat mdWdGm = new BasicEvoMat("Medium Wood Gem", 25.0);
        BasicEvoMat mdLtGm = new BasicEvoMat("Medium Light Gem", 25.0);
        BasicEvoMat mdDkGm = new BasicEvoMat("Medium Dark Gem", 25.0);

        BasicEvoMat smFrGm = new BasicEvoMat("Small Fire Gem", 12.5);
        BasicEvoMat smWtGm = new BasicEvoMat("Small Water Gem", 12.5);
        BasicEvoMat smWdGm = new BasicEvoMat("Small Wood Gem", 12.5);
        BasicEvoMat smLtGm = new BasicEvoMat("Small Light Gem", 12.5);
        BasicEvoMat smDkGm = new BasicEvoMat("Small Dark Gem", 12.5);

        BasicEvoMat kfr = new BasicEvoMat("King Ruby Dragon", 25.0/3);
        BasicEvoMat kwt = new BasicEvoMat("King Sapphire Dragon", 25.0/3);
        BasicEvoMat kwd = new BasicEvoMat("King Emerald Dragon", 25.0/3);
        BasicEvoMat klt = new BasicEvoMat("King Gold Dragon", 25.0/3);
        BasicEvoMat kdk = new BasicEvoMat("King Metal Dragon", 25.0/3);

        BasicEvoMat rbdf = new BasicEvoMat("Diamond Dragon Fruit", 178.571429);

        //Almighty Awoken Zeus Vulcan's Gem

        List<BasicEvoMat> evomatZeusVulcan = new ArrayList<BasicEvoMat>();

        evomatZeusVulcan.add(zeusVulcan);
        evomatZeusVulcan.add(kofr);
        evomatZeusVulcan.add(kor);
        evomatZeusVulcan.add(mm);
        evomatZeusVulcan.add(frdlt);
        evomatZeusVulcan.add(rbdlt);

        evomatZeusVulcan.add(kofr);
        evomatZeusVulcan.add(frdf);
        evomatZeusVulcan.add(frj);
        evomatZeusVulcan.add(frj);
        evomatZeusVulcan.add(ltj);

        Gem uniqueGemZeusVulcan = new Gem("Almighty Awoken Zeus Vulcan's Gem", evomatZeusVulcan, 883883);

        //Awoken Dancing Queen Hera-Ur

        List<BasicEvoMat> evomatHeraUr = new ArrayList<BasicEvoMat>();

        evomatHeraUr.add(heraUr);
        evomatHeraUr.add(rbdlt);
        evomatHeraUr.add(frdm);
        evomatHeraUr.add(mm);
        evomatHeraUr.add(kofr);
        evomatHeraUr.add(kor);

        evomatHeraUr.add(rbdlt);
        evomatHeraUr.add(devlt);
        evomatHeraUr.add(frj);
        evomatHeraUr.add(frj);
        evomatHeraUr.add(frj);

        Gem uniqueGemHeraUr = new Gem("Awoken Dancing Queen Hera-Ur's Gem", evomatHeraUr, 883883);

        //Avowed Thief, Ishikawa Goemon's Gem

        List<BasicEvoMat> evomatGoemon = new ArrayList<BasicEvoMat>();

        evomatGoemon.add(goemon);
        evomatGoemon.add(frdem);
        evomatGoemon.add(frdm);
        evomatGoemon.add(frdlt);
        evomatGoemon.add(kofr);
        evomatGoemon.add(kor);

        evomatGoemon.add(kog);
        evomatGoemon.add(frdf);
        evomatGoemon.add(frdlt);
        evomatGoemon.add(frdlt);
        evomatGoemon.add(frj);

        Gem uniqueGemGoemon = new Gem("Avowed Thief, Ishikawa Goemon's Gem", evomatGoemon, 707107);

        //Passionate Dragon Caller, Ace's Gem
        BasicEvoMat ace = new BasicEvoMat("Dragon Caller, Ace", 25);

        List<BasicEvoMat> evomatAce = new ArrayList<BasicEvoMat>();

        evomatAce.add(ace);
        evomatAce.add(kofr);
        evomatAce.add(frdm);
        evomatAce.add(frdlt);
        evomatAce.add(frdlt);
        evomatAce.add(rbdlt);

        Gem uniqueGemAce = new Gem("Passionate Dragon Caller, Ace's Gem", evomatAce, 883883);

        //War Machine King, Liberty Geist
        BasicEvoMat libertyGeist = new BasicEvoMat("Liberty Geist", 25);

        List<BasicEvoMat> evomatLibertyGeist = new ArrayList<BasicEvoMat>();

        evomatLibertyGeist.add(libertyGeist);
        evomatLibertyGeist.add(lgFrGm);
        evomatLibertyGeist.add(lgWdGm);
        evomatLibertyGeist.add(kofr);
        evomatLibertyGeist.add(wddlt);
        evomatLibertyGeist.add(rbdlt);

        Gem uniqueGemLibertyGeist = new Gem("War Machine King, Liberty Geist's Gem", evomatLibertyGeist, 0);

        //Scorched Horned Heavenly Fire God, Agni
        BasicEvoMat agni = new BasicEvoMat("Heavenly Fire God, Agni", 25);

        List<BasicEvoMat> evomatAgni = new ArrayList<BasicEvoMat>();

        evomatAgni.add(agni);
        evomatAgni.add(kofr);
        evomatAgni.add(kog);
        evomatAgni.add(mm);
        evomatAgni.add(frdlt);
        evomatAgni.add(ltdlt);

        Gem uniqueGemAgni = new Gem("Scorched Horned Heavenly Fire God, Agni's Gem", evomatAgni, 0);

        //Demon Leader, Shuten-doji's Gem
        BasicEvoMat shutendoji = new BasicEvoMat("Shuten-doji", 25);

        List<BasicEvoMat> evomatShutendoji = new ArrayList<BasicEvoMat>();

        evomatShutendoji.add(shutendoji);
        evomatShutendoji.add(lgFrGm);
        evomatShutendoji.add(lgFrGm);
        evomatShutendoji.add(mm);
        evomatShutendoji.add(frdlt);
        evomatShutendoji.add(devlt);

        Gem uniqueGemShutendoji = new Gem("Demon Leader, Shuten-doji's Gem", evomatShutendoji, 0);

        //Firespike Hell Beast, Manticore
        BasicEvoMat manticore = new BasicEvoMat("Manticore", 25);

        List<BasicEvoMat> evomatManticore = new ArrayList<BasicEvoMat>();

        evomatManticore.add(manticore);
        evomatManticore.add(kofr);
        evomatManticore.add(frdm);
        evomatManticore.add(dfl);
        evomatManticore.add(frdlt);
        evomatManticore.add(wddlt);

        Gem uniqueGemManticore = new Gem("Firespike Hell Beast, Manticore's Gem", evomatManticore, 1663863);

        //Unyielding Samurai Dragon King, Zaerog's Gem

        List<BasicEvoMat> evomatFrZaerog = new ArrayList<BasicEvoMat>();

        evomatFrZaerog.add(zaerog);
        evomatFrZaerog.add(kofr);
        evomatFrZaerog.add(smWtGm);
        evomatFrZaerog.add(smWdGm);
        evomatFrZaerog.add(smLtGm);
        evomatFrZaerog.add(smDkGm);

        Gem uniqueGemFrZaerog = new Gem("Unyielding Samurai Dragon King, Zaerog's Gem", evomatFrZaerog, 0);

        //Reincarnated Burning Phoenix Knight, Homura's Gem
        BasicEvoMat homura = new BasicEvoMat("Phoenix Knight", 50);

        List<BasicEvoMat> evomatHomura = new ArrayList<BasicEvoMat>();

        evomatHomura.add(homura);
        evomatHomura.add(mm);
        evomatHomura.add(frdm);
        evomatHomura.add(kofr);
        evomatHomura.add(rblt);
        evomatHomura.add(frlt);

        evomatHomura.add(kofr);
        evomatHomura.add(kor);
        evomatHomura.add(mm);
        evomatHomura.add(frdlt);
        evomatHomura.add(rbdlt);

        evomatHomura.add(frem);
        evomatHomura.add(frem);
        evomatHomura.add(frem);
        evomatHomura.add(frem);
        evomatHomura.add(frem);

        Gem uniqueGemHomura = new Gem("Reincarnated Burning Phoenix Knight, Homura's Gem", evomatHomura, 3623949);

        //Almighty Awoken Zeus Mercury's Gem
        BasicEvoMat zeusMercury = new BasicEvoMat("Zeus Mercury", 25);

        List<BasicEvoMat> evomatZeusMercury = new ArrayList<BasicEvoMat>();

        evomatZeusMercury.add(zeusMercury);
        evomatZeusMercury.add(kowt);
        evomatZeusMercury.add(wtdm);
        evomatZeusMercury.add(wtdlt);
        evomatZeusMercury.add(ltdlt);
        evomatZeusMercury.add(rbdlt);

        evomatZeusMercury.add(kowt);
        evomatZeusMercury.add(absm);
        evomatZeusMercury.add(wtj);
        evomatZeusMercury.add(wtj);
        evomatZeusMercury.add(ltj);

        Gem uniqueGemZeusMercury = new Gem("Almighty Awoken Zeus Mercury's Gem", evomatZeusMercury, 883883);

        //Permafrost Queen, Hera-Is's Gem
        BasicEvoMat heraIs = new BasicEvoMat("Hera-Is", 25);

        List<BasicEvoMat> evomatHeraIs = new ArrayList<BasicEvoMat>();

        evomatHeraIs.add(heraIs);
        evomatHeraIs.add(rbdlt);
        evomatHeraIs.add(wtdm);
        evomatHeraIs.add(mm);
        evomatHeraIs.add(kowt);
        evomatHeraIs.add(kor);

        evomatHeraIs.add(absm);
        evomatHeraIs.add(wtdlt);
        evomatHeraIs.add(wtj);
        evomatHeraIs.add(wtj);
        evomatHeraIs.add(wtj);

        Gem uniqueGemHeraIs = new Gem("Permafrost Queen, Hera-Is's Gem", evomatHeraIs, 883883);

        //White Rainbow Ark, Noah's Gem
        BasicEvoMat noah = new BasicEvoMat("Noah", 25);

        List<BasicEvoMat> evomatNoah = new ArrayList<BasicEvoMat>();

        evomatNoah.add(noah);
        evomatNoah.add(kowt);
        evomatNoah.add(kowt);
        evomatNoah.add(wtdlt);
        evomatNoah.add(ltdlt);
        evomatNoah.add(rbdlt);

        evomatNoah.add(kowt);
        evomatNoah.add(kolt);
        evomatNoah.add(absm);
        evomatNoah.add(wtj);
        evomatNoah.add(ltj);

        Gem uniqueGemNoah = new Gem("White Rainbow Ark, Noah's Gem", evomatNoah, 707107);

        //Reincarnated Torrential Fenrir Knight, Kamui's Gem
        BasicEvoMat kamui = new BasicEvoMat("Fenrir Knight", 50);

        List<BasicEvoMat> evomatKamui = new ArrayList<BasicEvoMat>();

        evomatKamui.add(kamui);
        evomatKamui.add(mm);
        evomatKamui.add(wtdm);
        evomatKamui.add(kowt);
        evomatKamui.add(rblt);
        evomatKamui.add(wtlt);

        evomatKamui.add(kowt);
        evomatKamui.add(kor);
        evomatKamui.add(mm);
        evomatKamui.add(wtdlt);
        evomatKamui.add(rbdlt);

        evomatKamui.add(wtem);
        evomatKamui.add(wtem);
        evomatKamui.add(wtem);
        evomatKamui.add(wtem);
        evomatKamui.add(wtem);

        Gem uniqueGemKamui = new Gem("Reincarnated Torrential Fenrir Knight, Kamui's Gem", evomatKamui, 3623949);

        //Mystic Pentad Dragon, Folklore's Gem
        BasicEvoMat folklore = new BasicEvoMat("Mystic Mechdragon, Antikythera", 50);

        List<BasicEvoMat> evomatFolklore = new ArrayList<BasicEvoMat>();

        evomatFolklore.add(folklore);
        evomatFolklore.add(smFrGm);
        evomatFolklore.add(smWdGm);
        evomatFolklore.add(smLtGm);
        evomatFolklore.add(smDkGm);
        evomatFolklore.add(skwt);

        Gem uniqueGemFolklore = new Gem("Mystic Pentad Dragon, Folklore's Gem", evomatFolklore, 0);

        //Dragon Emperor, Buster Siegfried's Gem
        BasicEvoMat siegfried = new BasicEvoMat("Berserk", 80);

        List<BasicEvoMat> evomatSiegfried = new ArrayList<BasicEvoMat>();

        evomatSiegfried.add(siegfried);
        evomatSiegfried.add(mm);
        evomatSiegfried.add(mm);
        evomatSiegfried.add(wtdm);
        evomatSiegfried.add(kowt);
        evomatSiegfried.add(rblt);

        evomatSiegfried.add(kor);
        evomatSiegfried.add(rbdlt);
        evomatSiegfried.add(wtdlt);
        evomatSiegfried.add(df);
        evomatSiegfried.add(mm);

        evomatSiegfried.add(kor);
        evomatSiegfried.add(kog);
        evomatSiegfried.add(wtdm);
        evomatSiegfried.add(wtdlt);
        evomatSiegfried.add(rbdlt);

        Gem uniqueGemSiegfried = new Gem("Dragon Emperor, Buster Siegfried's Gem", evomatSiegfried, 1929028);

        //Bold Pirate Dragon King, Zaerog's Gem

        List<BasicEvoMat> evomatWtZaerog = new ArrayList<BasicEvoMat>();

        evomatWtZaerog.add(zaerog);
        evomatWtZaerog.add(kowt);
        evomatWtZaerog.add(smFrGm);
        evomatWtZaerog.add(smWdGm);
        evomatWtZaerog.add(smLtGm);
        evomatWtZaerog.add(smDkGm);

        Gem uniqueGemWtZaerog = new Gem("Bold Pirate Dragon King, Zaerog's Gem", evomatWtZaerog,0);

        //Almighty Awoken Zeus-Dios's Gem
        BasicEvoMat zeusDios = new BasicEvoMat("Zeus-Dios", 25);

        List<BasicEvoMat> evomatZeusDios = new ArrayList<BasicEvoMat>();

        evomatZeusDios.add(zeusDios);
        evomatZeusDios.add(kor);
        evomatZeusDios.add(kowd);
        evomatZeusDios.add(mm);
        evomatZeusDios.add(rbdlt);
        evomatZeusDios.add(ltdlt);

        evomatZeusDios.add(kowd);
        evomatZeusDios.add(agsm);
        evomatZeusDios.add(wdj);
        evomatZeusDios.add(wdj);
        evomatZeusDios.add(ltj);

        Gem uniqueGemZeusDios = new Gem("Almighty Awoken Zeus-Dios's Gem", evomatZeusDios, 883883);

        //Colorful Queen, Hera-Beorc's Gem
        BasicEvoMat heraBeorc = new BasicEvoMat("Hera-Beorc", 25);

        List<BasicEvoMat> evomatHeraBeorc = new ArrayList<BasicEvoMat>();

        evomatHeraBeorc.add(heraBeorc);
        evomatHeraBeorc.add(kowd);
        evomatHeraBeorc.add(kor);
        evomatHeraBeorc.add(wddm);
        evomatHeraBeorc.add(mm);
        evomatHeraBeorc.add(rbdlt);

        evomatHeraBeorc.add(kowd);
        evomatHeraBeorc.add(devlt);
        evomatHeraBeorc.add(wdj);
        evomatHeraBeorc.add(wdj);
        evomatHeraBeorc.add(dkj);

        Gem uniqueGemHeraBeorc = new Gem("Colorful Queen, Hera-Beorc's Gem", evomatHeraBeorc, 883883);

        //Original Goddess of Decision, Gaia's Gem
        BasicEvoMat gaia = new BasicEvoMat("Gaia", 25);

        List<BasicEvoMat> evomatGaia = new ArrayList<BasicEvoMat>();

        evomatGaia.add(gaia);
        evomatGaia.add(kowd);
        evomatGaia.add(kowd);
        evomatGaia.add(wddm);
        evomatGaia.add(wddlt);
        evomatGaia.add(rbdlt);

        evomatGaia.add(kowd);
        evomatGaia.add(kowd);
        evomatGaia.add(wddlt);
        evomatGaia.add(wdj);
        evomatGaia.add(wdj);

        Gem uniqueGemGaia = new Gem("Original Goddess of Decision, Gaia's Gem", evomatGaia, 707107);

        //Reincarnated Ancient Dragon Knight, Zeal's Gem
        BasicEvoMat zeal = new BasicEvoMat("Dragon Knight", 50);

        List<BasicEvoMat> evomatZeal = new ArrayList<BasicEvoMat>();

        evomatZeal.add(zeal);
        evomatZeal.add(mm);
        evomatZeal.add(wddm);
        evomatZeal.add(kowd);
        evomatZeal.add(df);
        evomatZeal.add(wdlt);

        evomatZeal.add(kowd);
        evomatZeal.add(kor);
        evomatZeal.add(df);
        evomatZeal.add(wddlt);
        evomatZeal.add(rbdlt);

        evomatZeal.add(wdem);
        evomatZeal.add(wdem);
        evomatZeal.add(wdem);
        evomatZeal.add(wdem);
        evomatZeal.add(wdem);

        Gem uniqueGemZeal = new Gem("Reincarnated Ancient Dragon Knight, Zeal's Gem", evomatZeal, 3623949);

        //Serpent Steel Star Healer, Ras's Gem
        BasicEvoMat ras = new BasicEvoMat("Ras", 25);

        List<BasicEvoMat> evomatRas = new ArrayList<BasicEvoMat>();

        evomatRas.add(ras);
        evomatRas.add(kowd);
        evomatRas.add(wddm);
        evomatRas.add(wddlt);
        evomatRas.add(frdlt);
        evomatRas.add(rbdlt);

        Gem uniqueGemRas = new Gem("Serpent Steel Star Healer, Ras's Gem", evomatRas, 2079829);

        //Green Light's Blossom, Kaguya-Hime's Gem

        List<BasicEvoMat> evomatKaguyaHime = new ArrayList<BasicEvoMat>();

        evomatKaguyaHime.add(kaguyaHime);
        evomatKaguyaHime.add(kowd);
        evomatKaguyaHime.add(kolt);
        evomatKaguyaHime.add(wddm);
        evomatKaguyaHime.add(ltdlt);
        evomatKaguyaHime.add(rbdlt);

        evomatKaguyaHime.add(kowd);
        evomatKaguyaHime.add(mm);
        evomatKaguyaHime.add(wddlt);
        evomatKaguyaHime.add(wdj);
        evomatKaguyaHime.add(ltj);

        Gem uniqueGemKaguyaHime = new Gem("Green Light's Blossom, Kaguya-Hime's Gem", evomatKaguyaHime, 707107);

        //Queen of the Fairy Forest, Titania's Gem
        BasicEvoMat titania = new BasicEvoMat("Titania", 25);

        List<BasicEvoMat> evomatTitania = new ArrayList<BasicEvoMat>();

        evomatTitania.add(titania);
        evomatTitania.add(kowd);
        evomatTitania.add(kolt);
        evomatTitania.add(wddm);
        evomatTitania.add(wddlt);
        evomatTitania.add(rbdlt);

        Gem uniqueGemTitania = new Gem("Queen of the Fairy Forest, Titania's Gem", evomatTitania, 2079829);

        //Gods' Threat Venomous Snake, Jormungandr's Gem
        BasicEvoMat jormungandr = new BasicEvoMat("Jormungandr", 25);

        List<BasicEvoMat> evomatJormungandr = new ArrayList<BasicEvoMat>();

        evomatJormungandr.add(jormungandr);
        evomatJormungandr.add(lgWdGm);
        evomatJormungandr.add(lgWtGm);
        evomatJormungandr.add(wtdf);
        evomatJormungandr.add(wddf);
        evomatJormungandr.add(rbdlt);

        Gem uniqueGemJormungandr = new Gem("Gods' Threat Venomous Snake, Jormungandr's Gem", evomatJormungandr, 0);

        //Wolf Hero, Ignis Cu Chulainn's Gem
        BasicEvoMat cuChulainn = new BasicEvoMat("Highlander", 80);

        List<BasicEvoMat> evomatCuChulainn = new ArrayList<BasicEvoMat>();

        evomatCuChulainn.add(cuChulainn);
        evomatCuChulainn.add(mm);
        evomatCuChulainn.add(mm);
        evomatCuChulainn.add(wddm);
        evomatCuChulainn.add(kowd);
        evomatCuChulainn.add(rblt);

        evomatCuChulainn.add(kor);
        evomatCuChulainn.add(rbdlt);
        evomatCuChulainn.add(wddlt);
        evomatCuChulainn.add(df);
        evomatCuChulainn.add(mm);

        evomatCuChulainn.add(kor);
        evomatCuChulainn.add(kog);
        evomatCuChulainn.add(wddm);
        evomatCuChulainn.add(wddlt);
        evomatCuChulainn.add(rbdlt);

        Gem uniqueGemCuChulainn = new Gem("Wolf Hero, Ignis Cu Chulainn's Gem", evomatCuChulainn, 1929028);

        //Gleaming Queen, Hera-Sowilo's Gem
        BasicEvoMat heraSowilo = new BasicEvoMat("Hera-Sowilo", 25);

        List<BasicEvoMat> evomatHeraSowilo = new ArrayList<BasicEvoMat>();

        evomatHeraSowilo.add(heraSowilo);
        evomatHeraSowilo.add(kolt);
        evomatHeraSowilo.add(kor);
        evomatHeraSowilo.add(ltdm);
        evomatHeraSowilo.add(mm);
        evomatHeraSowilo.add(rbdlt);

        evomatHeraSowilo.add(kog);
        evomatHeraSowilo.add(mm);
        evomatHeraSowilo.add(ltj);
        evomatHeraSowilo.add(ltj);
        evomatHeraSowilo.add(dkj);

        Gem uniqueGemHeraSowilo = new Gem("Gleaming Queen, Hera-Sowilo's Gem", evomatHeraSowilo, 883883);

        //Guardian of the Sacred City, Athena's Gem
        BasicEvoMat athena = new BasicEvoMat("Athena", 25);

        List<BasicEvoMat> evomatAthena = new ArrayList<BasicEvoMat>();

        evomatAthena.add(athena);
        evomatAthena.add(kor);
        evomatAthena.add(kolt);
        evomatAthena.add(kowd);
        evomatAthena.add(rbdlt);
        evomatAthena.add(wddlt);

        evomatAthena.add(kolt);
        evomatAthena.add(mm);
        evomatAthena.add(anglt);
        evomatAthena.add(wdj);
        evomatAthena.add(ltj);

        Gem uniqueGemAthena = new Gem("Guardian of the Sacred City, Athena's Gem", evomatAthena, 883883);

        //Creation Empress God, Izanami
        BasicEvoMat ltIzanami = new BasicEvoMat("Empress God, Izanami", 25);

        List<BasicEvoMat> evomatLtIzanami = new ArrayList<BasicEvoMat>();

        evomatLtIzanami.add(ltIzanami);
        evomatLtIzanami.add(kor);
        evomatLtIzanami.add(ltdm);
        evomatLtIzanami.add(wtdlt);
        evomatLtIzanami.add(ltdlt);
        evomatLtIzanami.add(rbdlt);

        evomatLtIzanami.add(kolt);
        evomatLtIzanami.add(kor);
        evomatLtIzanami.add(ltdm);
        evomatLtIzanami.add(ltj);
        evomatLtIzanami.add(wtj);

        Gem uniqueGemLtIzanami = new Gem("Creation Empress God, Izanami's Gem", evomatLtIzanami, 883883);

        //Gleaming Kouryu Emperor, Fagan's Gem
        BasicEvoMat fagan = new BasicEvoMat("Incarnation of Kouryu, Fagan", 50);

        List<BasicEvoMat> evomatLtFagan = new ArrayList<BasicEvoMat>();

        evomatLtFagan.add(fagan);
        evomatLtFagan.add(kfr);
        evomatLtFagan.add(kwt);
        evomatLtFagan.add(kwd);
        evomatLtFagan.add(klt);
        evomatLtFagan.add(kdk);

        evomatLtFagan.add(frj);
        evomatLtFagan.add(wtj);
        evomatLtFagan.add(wdj);
        evomatLtFagan.add(ltj);
        evomatLtFagan.add(ltj);

        Gem uniqueGemLtFagan = new Gem("Gleaming Kouryu Emperor, Fagan's Gem", evomatLtFagan, 883883);

        //Enlightened Meditating God, Sandalphon's Gem

        List<BasicEvoMat> evomatSandalphon = new ArrayList<BasicEvoMat>();

        evomatSandalphon.add(sandalphon);
        evomatSandalphon.add(kolt);
        evomatSandalphon.add(kor);
        evomatSandalphon.add(mm);
        evomatSandalphon.add(wtdlt);
        evomatSandalphon.add(rbdlt);

        evomatSandalphon.add(kolt);
        evomatSandalphon.add(mm);
        evomatSandalphon.add(ltdlt);
        evomatSandalphon.add(ltj);
        evomatSandalphon.add(wtj);

        Gem uniqueGemSandalphon = new Gem("Enlightened Meditating God, Sandalphon's Gem", evomatSandalphon, 883883);

        //Light Mech General, Sherospada's Gem
        BasicEvoMat sherospada = new BasicEvoMat("Machine Golem Mk.III", 25);

        List<BasicEvoMat> evomatSherospada = new ArrayList<BasicEvoMat>();

        evomatSherospada.add(sherospada);
        evomatSherospada.add(lgFrGm);
        evomatSherospada.add(lgWtGm);
        evomatSherospada.add(lgWdGm);
        evomatSherospada.add(kog);
        evomatSherospada.add(kog);

        Gem uniqueGemSherospada = new Gem("Light Mech General, Sherospada's Gem", evomatSherospada, 0);

        //Lovely Dragon Caller, Ana's Gem
        BasicEvoMat ana = new BasicEvoMat("Dragon Caller, Ana", 25);

        List<BasicEvoMat> evomatAna = new ArrayList<BasicEvoMat>();

        evomatAna.add(ana);
        evomatAna.add(kolt);
        evomatAna.add(ltdm);
        evomatAna.add(ltdlt);
        evomatAna.add(frdlt);
        evomatAna.add(rbdlt);

        Gem uniqueGemAna = new Gem("Lovely Dragon Caller, Ana's Gem", evomatAna, 883883);

        //Sacred Dragon Beast, Angelion's Gem
        BasicEvoMat angelion = new BasicEvoMat("Fairlio", 25);

        List<BasicEvoMat> evomatAngelion = new ArrayList<BasicEvoMat>();

        evomatAngelion.add(angelion);
        evomatAngelion.add(dfl);
        evomatAngelion.add(dp);
        evomatAngelion.add(ds);
        evomatAngelion.add(ltlt);

        evomatAngelion.add(rbdlt);
        evomatAngelion.add(ltdlt);
        evomatAngelion.add(df);
        evomatAngelion.add(dfl);
        evomatAngelion.add(kolt);

        evomatAngelion.add(df);
        evomatAngelion.add(df);
        evomatAngelion.add(wddlt);
        evomatAngelion.add(ltdlt);
        evomatAngelion.add(rbdlt);

        Gem uniqueGemAngelion = new Gem("Sacred Dragon Beast, Angelion's Gem", evomatAngelion, 153365);

        //Reincarnated Godly Knight of the Sky, Verche's Gem
        BasicEvoMat verche = new BasicEvoMat("Verche", 25);

        List<BasicEvoMat> evomatVerche = new ArrayList<BasicEvoMat>();

        evomatVerche.add(verche);
        evomatVerche.add(mm);
        evomatVerche.add(ltdm);
        evomatVerche.add(kolt);
        evomatVerche.add(rblt);
        evomatVerche.add(ltlt);

        evomatVerche.add(kolt);
        evomatVerche.add(kor);
        evomatVerche.add(mm);
        evomatVerche.add(ltdlt);
        evomatVerche.add(rbdlt);

        evomatVerche.add(ltem);
        evomatVerche.add(ltem);
        evomatVerche.add(ltem);
        evomatVerche.add(ltem);
        evomatVerche.add(ltem);

        Gem uniqueGemVerche = new Gem("Reincarnated Godly Knight of the Sky, Verche's Gem", evomatVerche, 3623949);

        //Dawning Dragon Caller, Sonia Gran's Gem
        BasicEvoMat soniaGran = new BasicEvoMat("Dragon Caller, Sonia Gran", 25);

        List<BasicEvoMat> evomatSoniaGran = new ArrayList<BasicEvoMat>();

        evomatSoniaGran.add(soniaGran);
        evomatSoniaGran.add(lgDkGm);
        evomatSoniaGran.add(lgFrGm);
        evomatSoniaGran.add(lgWtGm);
        evomatSoniaGran.add(lgWdGm);
        evomatSoniaGran.add(lgLtGm);

        Gem uniqueGemSoniaGran = new Gem("Dawning Dragon Caller, Sonia Gran's Gem", evomatSoniaGran, 0);

        //Heaven Scribe, Enoch's Gem
        BasicEvoMat enoch = new BasicEvoMat("Enoch", 25);

        List<BasicEvoMat> evomatEnoch = new ArrayList<BasicEvoMat>();

        evomatEnoch.add(enoch);
        evomatEnoch.add(kolt);
        evomatEnoch.add(ltdm);
        evomatEnoch.add(mm);
        evomatEnoch.add(dkdlt);
        evomatEnoch.add(rbdlt);

        Gem uniqueGemEnoch = new Gem("Heaven Scribe, Enoch's Gem", evomatEnoch, 2079829);

        //Loving Heavenly Deities, Zeus & Hera's Gem
        BasicEvoMat zera = new BasicEvoMat("Zeus & Hera", 25);

        List<BasicEvoMat> evomatZera = new ArrayList<BasicEvoMat>();

        evomatZera.add(zera);
        evomatZera.add(lgLtGm);
        evomatZera.add(lgDkGm);
        evomatZera.add(lgDkGm);
        evomatZera.add(ltj);
        evomatZera.add(dkj);

        Gem uniqueGemZera = new Gem("Loving Heavenly Deities, Zeus & Hera's Gem", evomatZera, 0);

        //Elia Gem
        BasicEvoMat elia = new BasicEvoMat("Angel of Secret Destiny, Elia", 50);

        List<BasicEvoMat> evomatElia = new ArrayList<BasicEvoMat>();

        evomatElia.add(elia);

        Gem uniqueGemElia = new Gem("Angel of Secret Destiny, Elia's Gem", evomatElia, 0);


















        //Monstrous Cetacean of the Clouds, Moby Dick's Gem
        BasicEvoMat mobyDick = new BasicEvoMat("Moby Dick", 25);

        List<BasicEvoMat> evomatMobyDick = new ArrayList<BasicEvoMat>();

        evomatMobyDick.add(mobyDick);
        evomatMobyDick.add(kolt);
        evomatMobyDick.add(kolt);
        evomatMobyDick.add(kowt);
        evomatMobyDick.add(ltdlt);
        evomatMobyDick.add(rbdlt);

        Gem uniqueGemMobyDick = new Gem("Monstrous Cetacean of the Clouds, Moby Dick's Gem", evomatMobyDick, 1663863);

        //Falcon Guardian's Dark Scorpion Goddess, Serket's Gem
        BasicEvoMat serket = new BasicEvoMat("Serket", 25);

        List<BasicEvoMat> evomatSerket = new ArrayList<BasicEvoMat>();

        evomatSerket.add(serket);
        evomatSerket.add(mdDkGm);
        evomatSerket.add(lgFrGm);
        evomatSerket.add(kor);
        evomatSerket.add(dkdlt);
        evomatSerket.add(devlt);

        Gem uniqueGemSerket = new Gem("Falcon Guardian's Dark Scorpion Goddess, Serket's Gem", evomatSerket, 0);

        //Storm Mighty Dragon Emperor, Lifive's Gem
        BasicEvoMat lifive = new BasicEvoMat("Mighty Dragon Emperor, Lifive", 50);

        List<BasicEvoMat> evomatLifive = new ArrayList<BasicEvoMat>();

        evomatLifive.add(lifive);
        evomatLifive.add(mdFrGm);
        evomatLifive.add(uniqueGemHeraUr);
        evomatLifive.add(frdf);
        evomatLifive.add(frdf);
        evomatLifive.add(frdf);

        Gem uniqueGemLifive = new Gem("Storm Mighty Dragon Emperor, Lifive's Gem", evomatLifive, 0);

        //Violent Dragon Lord of Tyranny, Valten's Gem
        BasicEvoMat valten = new BasicEvoMat("Violent Dragon Lord, Valten", 50);

        List<BasicEvoMat> evomatValten = new ArrayList<BasicEvoMat>();

        evomatValten.add(valten);
        evomatValten.add(lgFrGm);
        evomatValten.add(uniqueGemLifive);
        evomatValten.add(frdf);
        evomatValten.add(frdf);
        evomatValten.add(frdf);

        Gem uniqueGemValten = new Gem("Violent Dragon Lord of Tyranny, Valten's Gem", evomatValten, 0);

        //Awoken Mechanical Goemon's Gem
        BasicEvoMat mgoe = new BasicEvoMat("Mechanical Goemon", 50);

        List<BasicEvoMat> evomatMgoe = new ArrayList<BasicEvoMat>();

        evomatMgoe.add(mgoe);
        evomatMgoe.add(uniqueGemGoemon);
        evomatMgoe.add(lgFrGm);
        evomatMgoe.add(uniqueGemHomura);
        evomatMgoe.add(uniqueGemLibertyGeist);
        evomatMgoe.add(frj);

        Gem uniqueGemMgoe = new Gem("Awoken Mechanical Goemon's Gem", evomatMgoe, 0);

        //Rainbow Wing Whirlwind Dragon Emperor, Sevenzard
        BasicEvoMat sevenzard = new BasicEvoMat("Whirlwind Dragon Emperor, Sevenzard", 50);

        List<BasicEvoMat> evomatSevenzard = new ArrayList<BasicEvoMat>();

        evomatSevenzard.add(sevenzard);
        evomatSevenzard.add(uniqueGemHeraBeorc);
        evomatSevenzard.add(mdWdGm);
        evomatSevenzard.add(wddf);
        evomatSevenzard.add(wddf);
        evomatSevenzard.add(wddf);

        Gem uniqueGemSevenzard = new Gem("Rainbow Wing Whirlwind Dragon Emperor, Sevenzard's Gem", evomatSevenzard, 0);

        //Valkyrie Gem
        BasicEvoMat valk = new BasicEvoMat("Valkyrie", 25);

        List<BasicEvoMat> evomatValk = new ArrayList<BasicEvoMat>();

        evomatValk.add(valk);
        evomatValk.add(mm);
        evomatValk.add(mm);
        evomatValk.add(ltdm);
        evomatValk.add(kolt);
        evomatValk.add(rblt);

        evomatValk.add(kor);
        evomatValk.add(rbdlt);
        evomatValk.add(ltdlt);
        evomatValk.add(df);
        evomatValk.add(mm);

        evomatValk.add(kor);
        evomatValk.add(mm);
        evomatValk.add(df);
        evomatValk.add(wddlt);
        evomatValk.add(ltdlt);

        evomatValk.add(ekmd);
        evomatValk.add(kor);
        evomatValk.add(ltdm);
        evomatValk.add(ltj);
        evomatValk.add(wdj);

        Gem uniqueGemValk = new Gem("Divine Law Goddess, Valkyrie Rose's Gem", evomatValk, 1929028);

        //Sol Mani Gem
        BasicEvoMat solMani = new BasicEvoMat("Sol & Mani", 50);

        List<BasicEvoMat> evomatSolMani = new ArrayList<BasicEvoMat>();

        evomatSolMani.add(solMani);
        evomatSolMani.add(lgLtGm);
        evomatSolMani.add(lgWdGm);
        evomatSolMani.add(uniqueGemJormungandr);
        evomatSolMani.add(uniqueGemElia);
        evomatSolMani.add(uniqueGemValk);

        Gem uniqueGemSolMani = new Gem("Glowing Celestial Divinities, Sol & Mani's Gem", evomatSolMani, 0);




        //Blue Sky Goddess of Dawn, Khepri's Gem
        BasicEvoMat khepri = new BasicEvoMat("Khepri", 25);

        List<BasicEvoMat> evomatKhepri = new ArrayList<BasicEvoMat>();

        evomatKhepri.add(khepri);
        evomatKhepri.add(lgWtGm);
        evomatKhepri.add(uniqueGemValk);
        evomatKhepri.add(mm);
        evomatKhepri.add(wtdlt);
        evomatKhepri.add(absm);

        Gem uniqueGemKhepri = new Gem("Blue Sky Goddess of Dawn, Khepri's Gem", evomatKhepri, 0);


        //Barbed Frost Dragon Emperor, Ilsix's Gem
        BasicEvoMat ilsix = new BasicEvoMat("Frost Dragon Emperor, Ilsix", 50);

        List<BasicEvoMat> evomatIlsix = new ArrayList<BasicEvoMat>();

        evomatIlsix.add(ilsix);
        evomatIlsix.add(uniqueGemHeraIs);
        evomatIlsix.add(mdWtGm);
        evomatIlsix.add(wtdf);
        evomatIlsix.add(wtdf);
        evomatIlsix.add(wtdf);

        Gem uniqueGemIlsix = new Gem("Barbed Frost Dragon Emperor, Ilsix's Gem", evomatIlsix, 0);

        //Draconic Songstress of Blue Echoes, Mion's Gem
        BasicEvoMat mion = new BasicEvoMat("Mion", 25);

        List<BasicEvoMat> evomatMion = new ArrayList<BasicEvoMat>();

        evomatMion.add(mion);
        evomatMion.add(uniqueGemIlsix);
        evomatMion.add(uniqueGemGaia);
        evomatMion.add(df);
        evomatMion.add(wtdf);
        evomatMion.add(wtdlt);

        Gem uniqueGemMion = new Gem("Draconic Songstress of Blue Echoes, Mion's Gem", evomatMion, 0);

        //Righteous Warblade, Qilin's Gem
        BasicEvoMat qilin = new BasicEvoMat("Qilin", 50);

        List<BasicEvoMat> evomatQilin = new ArrayList<BasicEvoMat>();

        evomatQilin.add(qilin);
        evomatQilin.add(rbdf);
        evomatQilin.add(uniqueGemKhepri);
        evomatQilin.add(uniqueGemMion);
        evomatQilin.add(uniqueGemNoah);
        evomatQilin.add(uniqueGemLtFagan);

        Gem uniqueGemQilin = new Gem("Righteous Warblade, Qilin's Gem", evomatQilin, 0);

        //Shrine Komainu Princess, Senri's Gem
        BasicEvoMat senri = new BasicEvoMat("Senri", 50);

        List<BasicEvoMat> evomatSenri = new ArrayList<BasicEvoMat>();

        evomatSenri.add(senri);
        evomatSenri.add(rbdf);
        evomatSenri.add(uniqueGemManticore);
        evomatSenri.add(uniqueGemShutendoji);
        evomatSenri.add(uniqueGemMgoe);
        evomatSenri.add(uniqueGemLtIzanami);

        Gem uniqueGemSenri = new Gem("Shrine Komainu Princess, Senri's Gem", evomatSenri, 0);

        //Quiet Night Storyteller, Scheherazade's Gem
        BasicEvoMat scheherazade = new BasicEvoMat("Scheherazade", 50);

        List<BasicEvoMat> evomatScheherazade = new ArrayList<BasicEvoMat>();

        evomatScheherazade.add(scheherazade);
        evomatScheherazade.add(rbdf);
        evomatScheherazade.add(uniqueGemElia);
        evomatScheherazade.add(uniqueGemValk);
        evomatScheherazade.add(uniqueGemMobyDick);
        evomatScheherazade.add(uniqueGemSerket);

        Gem uniqueGemScheherazade = new Gem("Quiet Night Storyteller, Scheherazade's Gem", evomatScheherazade, 0);

//        displayGemInfo(uniqueGemZeusVulcan);
//        displayGemInfo(uniqueGemHeraUr);
//        displayGemInfo(uniqueGemGoemon);
//        displayGemInfo(uniqueGemLifive);
//        displayGemInfo(uniqueGemValten);
//        displayGemInfo(uniqueGemAce);
//        displayGemInfo(uniqueGemHomura);
//        displayGemInfo(uniqueGemLibertyGeist);
//        displayGemInfo(uniqueGemAgni);
//        displayGemInfo(uniqueGemShutendoji);
//        displayGemInfo(uniqueGemManticore);
//        displayGemInfo(uniqueGemFrZaerog);
//        displayGemInfo(uniqueGemMgoe);

//        displayGemInfo(uniqueGemZeusMercury);
//        displayGemInfo(uniqueGemHeraIs);
//        displayGemInfo(uniqueGemNoah);
//        displayGemInfo(uniqueGemIlsix);
//        displayGemInfo(uniqueGemKamui);
//        displayGemInfo(uniqueGemKhepri);
//        displayGemInfo(uniqueGemMion);
//        displayGemInfo(uniqueGemFolklore);
//        displayGemInfo(uniqueGemSiegfried);
//        displayGemInfo(uniqueGemWtZaerog);

//        displayGemInfo(uniqueGemZeusDios);
//        displayGemInfo(uniqueGemHeraBeorc);
//        displayGemInfo(uniqueGemGaia);
//        displayGemInfo(uniqueGemZeal);
//        displayGemInfo(uniqueGemRas);
//        displayGemInfo(uniqueGemKaguyaHime);
//        displayGemInfo(uniqueGemTitania);
//        displayGemInfo(uniqueGemJormungandr);
//        displayGemInfo(uniqueGemCuChulainn);

        displayGemInfo(uniqueGemScheherazade);
        displayPlusPointValue(uniqueGemScheherazade);






    }

    public static void displayGemInfo(Gem input)
    {
        System.out.println(input.retrieveName() + " - Stamina Cost: " + input.retrieveStam());
        System.out.println();
        return;
    }

    public static void displayPlusPointValue(Gem input)
    {
        System.out.println(input.retrieveName() + " - Plus Point Value: " + (input.retrieveStam()/50)*83);
        System.out.println("This is " + ((input.retrieveStam()/50)*83)/297 + " 297 Plus Points.");
        System.out.println();
        return;
    }

    public static void displayAllBasicEvoMats(List<BasicEvoMat> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            System.out.println(input.get(i).retrieveName());
            System.out.println("Average Stam Cost: " + input.get(i).retrieveStam());
            System.out.println();
        }
        return;
    }

    public static void displayAllGemVariants(List<Gem> input)
    {
        for (int i = 0; i < input.size(); i++)
        {
            System.out.println(input.get(i).retrieveName());
            System.out.println("Average Stam Cost: " + input.get(i).retrieveStam());
            System.out.println();
        }
    }

    public static void compareElementGems(List<Gem> inputList, BasicEvoMat baseGem)
    {
        for (int i = 0; i < inputList.size(); i++)
        {
            if (baseGem.retrieveStam() == 0)
            {
                baseGem.setStam(inputList.get(i).retrieveStam());
            } else if (inputList.get(i).retrieveStam() < baseGem.retrieveStam())
            {
                baseGem.setStam(inputList.get(i).retrieveStam());
            }
        }
    }

}
