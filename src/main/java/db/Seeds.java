package db;

import db.helpers.*;
import models.*;

public class Seeds {

    public static void seedData(){

        DBCategory.deleteAll();
        DBTag.deleteAll();
        DBVisitor.deleteAll();
        DBComment.deleteAll();
        DBArticle.deleteAll();
        DBWriter.deleteAll();
        DBImage.deleteAll();


        Category category1 = new Category("Family");
        DBHelper.save(category1);

        Category category2 = new Category("Budget");
        DBHelper.save(category2);

        Category category3 = new Category("Cycling");
        DBHelper.save(category3);

        Category category4 = new Category("Foodie");
        DBHelper.save(category4);

        Category category5 = new Category("Walking");
        DBHelper.save(category5);

        Tag tag1 = new Tag("food");
        DBHelper.save(tag1);

        Tag tag2 = new Tag("city");
        DBHelper.save(tag2);

        Tag tag3 = new Tag("walking");
        DBHelper.save(tag3);

        Tag tag4 = new Tag("bike");
        DBHelper.save(tag4);

        Tag tag5 = new Tag("cheap");
        DBHelper.save(tag5);

        Visitor visitor = new Visitor("Stuart");
        DBHelper.save(visitor);

        Image madrid = new Image("/stockImages/Madrid.jpg", "Looking over Madrid at sunset");
        DBHelper.save(madrid);

        Image cairo = new Image("/stockImages/Cairo_after_dark.jpg", "Skyline of Cairo after sunset");
        DBHelper.save(cairo);

        Image quebec = new Image("/stockImages/Quebec_FME_festival.jpg", "Dj playing with dancing crowd at a secret venue at the Quebec FME festival");
        DBHelper.save(quebec);

        Image tome = new Image("/stockImages/sao-tome-and-principe.jpg", "Boat dragged on to the white sand beach with crystal blue waters behind");
        DBHelper.save(tome);

        Image taj = new Image("/stockImages/Taj_Mahal.jpg", "View of the front of the Taj Mahal");
        DBHelper.save(taj);

        Image tbilisi = new Image("/stockImages/Tbilisi.jpg", "View of the city of Tblisi climbing over its hills");
        DBHelper.save(tbilisi);

        Writer writer1 = new Writer("Aya Stafford", "Aya is a 27-year-old trainee doctor who enjoys going to the movies, reading and walking. She is kind and caring, but can also be very boring and a bit untidy.");
        DBHelper.save(writer1);

        Writer writer2 = new Writer("Hamid Cooke", "Hamid is a 30-year-old tradesperson whose life is dominated by cycling.");
        DBHelper.save(writer2);

        Writer writer3 = new Writer("Kaitlyn Markham", "My work explores the relationship between emerging trends and urban spaces."
                );
        DBHelper.save(writer3);

        Writer writer4 = new Writer("Jed Oakley", "With influences as diverse as Camus and Buckminster Fuller, new tensions are synthesised from both explicit and implicit meanings in my work.");
        DBHelper.save(writer4);

        Article article1 = new Article("Cairo After Dark", writer1, "Hidden away on a back street on Zamalek Island, Crimson Cairo has an unbeatable Nile view from its rooftop terrace. Sip on a glass of red from local winery Omar Khayyam at one of its tables overlooking the riverbanks, which all have a bird’s-eye view of the city lights. Having been on the nightlife scene since Egypt was dusting off the monarchy, the Cairo Cellar is a royal reminder of the past in the basement of The President Hotel, on Zamalek Island. This retro-chic English-style pub with a giant cellar stuffed full of liquor and wine, and it’s the place to try the Cellar’s own gin. We hope you packed your dancing shoes because The Tap is going to put them to work. This is one of Cairo’s favourite spots to let loose, although the policy for getting in is not lax, so be sure to make a reservation. When you make it inside, let your ears adjust, as the music (often from live bands) can go from quiet to intense in no time. When the dancing session comes to an end, channel your inner Messi through a game of foosball, or get competitive at the arcade machine. If you want a more DIY night out, hire a felucca for an impromptu sail down the Nile. It will take a bit of preparation: you’ll need to buy a few bottles from Drinkies and make a playlist of your favourite tunes. Feluccas can be rented from locals across from KFC on Abu El Feda St in Zamalek by the hour, and the operator will do the driving while you take care of the rest. The open-top boats allow for the wind to breeze through and carry your revelry into the Cairo night.", "Cairo might not be your first port of call when you’re after a good night out in the Middle East, but it’s made a raucous comeback.", cairo);
        DBHelper.save(article1);

        Article article2 = new Article("Taj Mahal", writer2, "The Taj was built by Shah Jahan as a memorial for his third wife, Mumtaz Mahal, who died giving birth to their 14th child in 1631. The death of Mumtaz left the emperor so heartbroken that his hair is said to have turned grey virtually overnight. Construction of the Taj began the following year; although the main building is thought to have been built in eight years, the whole complex was not completed until 1653. Not long after it was finished, Shah Jahan was overthrown by his son Aurangzeb and imprisoned in Agra Fort, where for the rest of his days he could only gaze out at his creation through a window. Following his death in 1666, Shah Jahan was buried here alongside his beloved Mumtaz. In total, some 20,000 people from India and Central Asia worked on the building. Specialists were brought in from as far away as Europe to produce the exquisite marble screens and pietra dura (marble inlay work) made with thousands of semiprecious stones. The Taj was designated a World Heritage Site in 1983 and looks nearly as immaculate today as when it was first constructed – though it underwent a huge restoration project in the early 20th century. The Taj can be accessed through the west, south and east gates. Tour groups tend to enter through the east and west gates. Independent travellers tend to use the south gate, which is nearest to Taj Ganj, the main area for budget accommodation, and generally has shorter queues than the west gate. The east gate has the shortest queues of the lot, but this is because the ticket office is inconveniently located a 1km walk away at Shilpgram, a dire, government-run tourist centre. There are separate queues for men and women at all three gates. Once you get your ticket, you can skip ahead of the lines of Indians waiting to get in – one perk of your pricey entry fee.", "Every year, tourists numbering more than twice the population of Agra pass through its gates to catch a once-in-a-lifetime glimpse of what is widely considered the most beautiful building in the world. Few leave disappointed.", taj);
        DBHelper.save(article2);

        Article article3 = new Article("24 Hours in Tbilisi", writer3, "Kick-start your day at the old-town branch of the bakery chain Entrée, then cross the cliff-girt Mtkvari River into Rike Park. Climb into the cable car that swings high over the old-town rooftops up to Narikala Fortress – an exhilarating ride that opens up sweeping panoramas of Tbilisi, laid out between the hills enclosing the Mtkvari valley. Explore the remains of the fortress, which has kept watch over Tbilisi since the 4th century AD, then stroll back down into the old town to wander streets strung with a mix of handsomely renovated and still-evocatively-dilapidated buildings. Soak in the atmosphere of tradition-infused churches like the Georgian Orthodox Sioni Cathedral and Anchiskhati Basilica, both dating from the 6th century; and browse intriguing shops like Caucasian Carpets, with colourful rugs from the South Caucasus, Iran and Central Asia. Cafes galore line the old-town streets: at Cafe Leila, opposite the Anchiskhati, you can order vegetarian snacks with your coffee, tea or mint lemonade amid stucco decor inset with Persian-style paintings. Check out the quirky, higgledy-piggledy clock tower outside the Gabriadze puppet theatre, then head south for a look at the Abanotubani, the domed, semi-subterranean sulphur baths whose springs gave the city its name (tbili is Georgian for warm). Nearby, bustling, bright Maspindzelo is the perfect place to introduce yourself to Georgia's unique cuisine, an often-spicy fusion of Middle Eastern, Russian, Persian and other influences with the bountiful produce of Georgia's fertile soil. Lunch here on tasty classics such as spicy khinkali dumplings, khachapuri cheese pies or mtsvadi shish kebabs. A good place to dive into the late-night Tbilisi club scene is Cafe-Gallery, a relaxed cafe that morphs as the night progresses into a dance party with a steady diet of minimal techno and house – open nightly and especially packed on Friday and Saturday nights. In the early hours of Saturday and Sunday you can head to Bassiani for the some of the most euphoric techno/house nights in Europe, in the classic setting of a disused swimming pool in the bowels of the Dinamo football stadium.", "An age-old Eurasian crossroads famous for its traditional hospitality and old winding streets, or a stylish hub of bold architecture, buzzing bars and a club culture that has gained labels like 'new Berlin'?", tbilisi );
        DBHelper.save(article3);

        Article article4 = new Article("Live like a local in Madrid", writer4, "I could wax poetic about Madrid’s… many different barrios, or neighbourhoods. Each one has a different history and personality, so there is always something to explore. From historic Sol to stately Retiro to trendy Malasaña, there is an area for everyone. A related perk is that central Madrid is incredibly easy to navigate on foot. More areas have become pedestrianised in recent years, making it even more pleasant to get from one barrio to another. I highly recommend walking the straight line between the metro stations Alonso Martinez and Goya for a look at how life plays out in the city. When I have friends in town… I do my best to give them a glimpse of local life while visiting the city’s main attractions. An easy way to do this is by sampling traditional food and drink. Shopping for olive oil somewhere like Patrimonio Comunal Olivarero makes for a memorable experience, while the more adventurous will be game for ordering callos (tripe) or morcilla (blood sausage) in a traditional taberna such as Antonio Sánchez. I encourage all visitors to try on-tap vermouth, a traditional drink that is still popular with madrileños. For the best photo ops… I’ve got two tips for you. For iconic shots of Madrid, take the elevator up to the rooftop terrace at the Círculo de Bellas Artes with its fantastic views of the Madrid skyline. For a different view of Madrid, head to Templo de Debod (an Egyptian temple) at sunset. If you come in summer… make sure to have a water bottle with you at all times. When Madrid heats up, shade and breeze quickly become luxuries. Pro tip: locals are quick to whip out fans, so consider purchasing a Spanish fan at Casa de Diego for a combination of personalised cooling system and souvenir. For cheap eats, I recommend… Pizza al Cuadrado, a pizzeria which serves up savoury and sweet rectangles with unexpected toppings. They specialise in intriguing combinations such as broccoli and butifarra, a Catalan sausage. My standby is the spicy cherry tomato pizza; while deceptively plain-looking, it packs a lot of zing. You’ll find the restaurant on the 9th floor of El Corte Ingles at Gourmet Experience, which provides a bird’s-eye view of the Gran Vía.", "A golden city that is vibrant, good-humoured, and fast-paced yet leisurely; one in which you can just as easily while away your time sampling blood sausage in a traditional taberna as you can taking a boat out on the lake at Parque del Buen Retiro.", madrid );
        DBHelper.save(article4);

        Article article5 = new Article("Beyond compare? The delights of São Tomé and Príncipe", writer1, "Rainforest cloaks 90 per cent of the island of Príncipe, tumbling down from its volcanic peaks to trespass on the coves that crease its northern coast. Where forest meets sea, palms protrude at opportunistic angles, as if to announce the empty beaches with an unbridled ‘ta-dah!’. Its beaches are as idyllic as the Seychelles' Príncipe’s many beaches range from the blissfully remote to lively fishing hubs. On Praia de Santa Rita, snorkellers drift over a small reef, seeking out parrotfish, barracuda and golden African snapper. To the west, on Praia de Coco, the prints in the sand left by lone wanderers are likely joined only by those of languid dogs. And aside from a pair of jostling tropic birds, Praia Banana, which once starred in a Bacardi ad, is deserted. Turquoise water laps at basalt boulders and a coconut is tossed about by the waves. It’s all a bit much for one palm, which has crashed out from the sheer bliss of it all. Further east, at Praia dos Burros, teenagers play cards on upturned boats while young boys perform back flips into the shallow water, shrieking with laughter and emerging plastered in sand. In front of the ramshackle stilt homes, flying fish are splayed out on rope beds, drying in the sun. ‘Bondja ô!’ calls a fisherman, whose wide smile reveals two premolars at the corners of his mouth. He wanders over to share a few words of the local Forro language. Portuguese is the official language on the islands, but 85 per cent of people speak one of three creoles. ‘Bon-jow-ooh’ he sings, drawing out the vowels of his good morning greeting, and laughs, proving that a warm Santomean welcome is just as appealing as a day in the sun on the beach. Its hiking trails as mysterious as Peru's It’s late afternoon and the saturated hues of Príncipe’s northwest coast are being painted with even more vivid brushstrokes: in this light, the bandy palm trunks appear almost amber and the wavy leaves of tropical almond trees turn an iridescent green.", "From castaway beaches to exquisite chocolate, the remote African island nation of São Tomé and Príncipe has attractions to rival the world’s best." , tome);
        DBHelper.save(article5);

        Article article6 = new Article("Secret shows abound at Quebec’s FME festival", writer2, "In one exhilarating weekend in late August or early September each year, the small town of Rouyn-Noranda (pop 42,000) swells to double that size as revelers from all over the world pour in. They’re coming to see their favorite emerging artists on stage, but also at secret pop-up shows in unexpected places, which are announced only at the last minute via a smartphone app. What makes it special? Founded in Quebec, Canada in 2003 by Jenny Thibault and Sandy Boutin, the Festival de Musique Emergente (FME) was designed to support new musicians and promote Canadian talent to the world. That has led to a mixture of English and French acts, from family-friendly singalongs, moody jazz numbers, exciting emerging talent, fresh hip hop crews and thundering metal bands to the old familiar favorites. hey play at traditional outdoor concert spaces as well as inside clubs, bars and breakfast joints, in churches, at the botanical gardens, at a garage, down alleyways and anywhere music can be made. An innovative app keeps festival-goers up-to-date on all the ‘secret’ shows, a practice started almost a decade ago: It was Random Recipe, a band from Montreal,’ Thibault says. ‘After their show they were so high and excited they decided to go to Morasse Poutine to do a surprise show for 200 people. That show at the festival-favorite restaurant was a hit – and suddenly other bands wanted to keep playing after their sets as well. It grew into a tradition that has become one of the most anticipated features of the festival. The last-minute announcements amp up the excitement, as the app sends alerts throughout the weekend to let revelers know where to head next. Make it happen When: Late August or early September Where: About a 7-hour car drive northwest from Montreal, Rouyn-Noranda is on Highway 117.", "The FME music festival in Quebec, Canada, just might be the most eclectic music festival in North America, with up to 70 live performers in a variety of genres and a ’gram-able array of art installations." , quebec);
        DBHelper.save(article6);

        Comment comment = new Comment("Great article", "Stuart", article1);
        DBHelper.save(comment);

        article1.addTag(tag1);
        article1.addTag(tag3);
        article1.addCategory(category5);

        article2.addTag(tag5);
        article2.addTag(tag4);
        article2.addCategory(category4);

        article3.addTag(tag2);
        article3.addTag(tag4);
        article3.addCategory(category3);

        article4.addTag(tag1);
        article4.addTag(tag3);
        article4.addCategory(category2);

        article5.addTag(tag2);
        article5.addTag(tag4);
        article5.addCategory(category1);

        article6.addTag(tag2);
        article6.addTag(tag3);
        article6.addCategory(category4);

        article1.indexVisitCounter();
        article1.indexVisitCounter();
        article1.indexVisitCounter();

        article2.indexVisitCounter();
        article2.indexVisitCounter();

        article3.indexVisitCounter();

        DBHelper.update(article1);
        DBHelper.update(article2);
        DBHelper.update(article3);
        DBHelper.update(article4);
        DBHelper.update(article5);
        DBHelper.update(article6);


    }


}
