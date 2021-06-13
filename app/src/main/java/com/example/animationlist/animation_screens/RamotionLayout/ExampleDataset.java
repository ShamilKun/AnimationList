package com.example.animationlist.animation_screens.RamotionLayout;

import com.example.animationlist.R;
import com.ramotion.expandingcollection.ECCardData;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ExampleDataset {


    private List<ECCardData> dataset;

    public ExampleDataset() {
        dataset = new ArrayList<>(5);

        CardData item5 = new CardData();
        item5.setMainBackgroundResource(R.drawable.attractions);
        item5.setHeadBackgroundResource(R.drawable.attractions_head);
        item5.setHeadTitle("Аттракционы");
        item5.setPersonMessage("От самых маленьких до лубителей экстрима ");
        item5.setPersonName("Камила Хизриева");
        item5.setPersonPictureResource(R.drawable.marjorie_ellis);
        item5.setListItems(prepareCommentsArray());
        dataset.add(item5);

        CardData item4 = new CardData();
        item4.setMainBackgroundResource(R.drawable.city_scape);
        item4.setHeadBackgroundResource(R.drawable.city_scape_head);
        item4.setHeadTitle("Ареда офисов");
        item4.setPersonMessage("Для маленьких и больших команд");
        item4.setPersonName("Роман Андреев");
        item4.setPersonPictureResource(R.drawable.mattew_jordan);
        item4.setListItems(prepareCommentsArray());
        dataset.add(item4);

        CardData item3 = new CardData();
        item3.setMainBackgroundResource(R.drawable.cuisine);
        item3.setHeadBackgroundResource(R.drawable.cuisine_head);
        item3.setHeadTitle("Еда");
        item3.setPersonMessage("Скоро будем проводить обновление меню");
        item3.setPersonName("Ислам Курамагомедов");
        item3.setPersonPictureResource(R.drawable.ross_rodriguez);
        item3.setListItems(prepareCommentsArray());
        dataset.add(item3);

        CardData item2 = new CardData();
        item2.setMainBackgroundResource(R.drawable.nature);
        item2.setHeadBackgroundResource(R.drawable.nature_head);
        item2.setHeadTitle("Природа");
        item2.setPersonName("Хадижат Курбанова");
        item2.setPersonMessage("Туристические походы каждую неделю");
        item2.setListItems(prepareCommentsArray());
        item2.setPersonPictureResource(R.drawable.tina_caldwell);
        dataset.add(item2);

        CardData item1 = new CardData();
        item1.setMainBackgroundResource(R.drawable.night_life);
        item1.setHeadBackgroundResource(R.drawable.night_life_head);
        item1.setHeadTitle("Путевки");
        item1.setPersonMessage("Куда угодно, когда угодно");
        item1.setPersonName("Камиль Омаров");
        item1.setPersonPictureResource(R.drawable.wallace_sutton);
        item1.setListItems(prepareCommentsArray());
        dataset.add(item1);

    }

    public List<ECCardData> getDataset() {
        Collections.shuffle(dataset);
        return dataset;
    }

    private List<Comment> prepareCommentsArray() {
        Random random = new Random();
        List<Comment> comments = new ArrayList<>();
        comments.addAll(Arrays.asList(
                new Comment(R.drawable.aaron_bradley, "Магомед Камилов", "Слышал на редукторном филиал хотят окрыть, надеюсь правда", "01.11.2021"),
                new Comment(R.drawable.barry_allen, "Рамазан Нурмагомедов", "Замечательно, обязательно посетим с семьей ", "11.01.2015"),
                new Comment(R.drawable.bella_holmes, "Мадина Джамбулатова", "Была недавно, остались только приятные эмоции", "12.12.2019"),
                new Comment(R.drawable.caroline_shaw, "Диана Магомедшарипова", "6 из 10, могло быть намного лучше", "14.10.2017"),
                new Comment(R.drawable.connor_graham, "Гонор Грахам", "Часто посещаю вас, очень атмосферно, к тому-же цены не кусаются ", "01.01.2018"),
                new Comment(R.drawable.deann_hunt, "Кирил Андреев", "Круто, часто тусуемся тут с друзьями", "21.11.2021"),
                new Comment(R.drawable.ella_cole, "Амина Раисова", "Всегда рекомендю вас своим друзьям", "11.11.2015"),
                new Comment(R.drawable.jayden_shaw, "Курбан Курбанов", "я просто ошарашен, на выходных приду еще раз.", "16.06.2013"),
                new Comment(R.drawable.jerry_carrol, "Фаяз Реянши", "Такое себе, в Индии намного лучше", "27.02.2019"),
                new Comment(R.drawable.lena_lucas, "Лена Васильева", "Неописуемо, у меня нет слов, 100 из 10", "03.10.2011"),
                new Comment(R.drawable.leonrd_kim, "Руслан Омаров", "Я как человек с большим опытом, смело заявляю что все просто прекрасно", "04.06.2020"),
                new Comment(R.drawable.marc_baker, "Хизри Алиев", "Улёт, просто класс", "27 10, 2020")));
        Collections.shuffle(comments);
        return comments.subList(0, 6 + random.nextInt(5));
    }
}
