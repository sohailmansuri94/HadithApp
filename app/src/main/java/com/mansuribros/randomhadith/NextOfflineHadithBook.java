package com.mansuribros.randomhadith;

/**
 * Created by Sohail on 8/22/2016.
 */
public class NextOfflineHadithBook {

    //All the offline Hadiths and references are declared here;
    private String hadithChapterName, hadithSource, bookNumber;

    /*        public void hadithsas()throws FileNotFoundException{
                    BufferedReader readHadithFile = new BufferedReader(new FileReader("hadiths.txt"));
                    String hadith = null;
                    try {
                            hadith = readHadithFile.readLine();
                    }catch (IOException e){

                    }
            }*/
    private String[] hadith = {"Narrated 'Umar bin Al-Khattab: I heard Allah's Apostle saying, " +
            "\"The reward of deeds depends upon the intentions and every person will get the reward according to what he has intended. " +
            "So whoever emigrated for worldly benefits or for a woman to marry, his emigration was for what he emigrated for.\"  ",

            "Narrated 'Aisha: (the mother of the faithful believers) Al-Harith bin Hisham asked Allah's Apostle" +
                    " \"O Allah's Apostle! How is the Divine Inspiration revealed to you?\" " +
                    "Allah's Apostle replied, \"Sometimes it is (revealed) like the ringing of a bell, this form of Inspiration " +
                    "is the hardest of all and then this state passes ' off after I have grasped what is inspired. " +
                    "Sometimes the Angel comes in the form of a man and talks to me and I grasp whatever he says.\" 'Aisha added: " +
                    "Verily I saw the Prophet being inspired Divinely on a very cold day and noticed the Sweat dropping from his " +
                    "forehead (as the Inspiration was over).",

            "Narrated 'Aisha: (the mother of the faithful believers) The commencement of the Divine Inspiration to Allah's Apostle was " +
                    "in the form of good dreams which came true like bright day light, and then the love of seclusion was bestowed upon him. " +
                    "He used to go in seclusion in the cave of Hira where he used to worship (Allah alone) continuously for many days before " +
                    "his desire to see his family. He used to take with him the journey food for the stay and then come back to (his wife) Khadija " +
                    "to take his food like-wise again till suddenly the Truth descended upon him while he was in the cave of Hira. The angel came to him " +
                    "and asked him to read. The Prophet replied, \"I do not know how to read. The Prophet added, \"The angel caught me (forcefully) " +
                    "and pressed me so hard that I could not bear it any more. He then released me and again asked me to read and I replied, " +
                    "'I do not know how to read.' Thereupon he caught me again and pressed me a second time till I could not bear it any more. " +
                    "He then released me and again asked me to read but again I replied, 'I do not know how to read (or what shall I read)?' " +
                    "Thereupon he caught me for the third time and pressed me, and then released me and said, 'Read in the name of your Lord, " +
                    "who has created (all that exists) has created man from a clot. Read! And your Lord is the Most Generous.\" (96.1, 96.2, 96.3) " +
                    "Then Allah's Apostle returned with the Inspiration and with his heart beating severely. Then he went to Khadija bint Khuwailid and said, " +
                    "\"Cover me! Cover me!\" They covered him till his fear was over and after that he told her everything that had happened and said, " +
                    "\"I fear that something may happen to me.\" Khadija replied, \"Never! By Allah, Allah will never disgrace you. " +
                    "You keep good relations with your Kith and kin, help the poor and the destitute, serve your guests generously and assist " +
                    "the deserving calamity-afflicted ones.\" Khadija then accompanied him to her cousin Waraqa bin Naufal bin Asad bin " +
                    "'Abdul 'Uzza, who, during the PreIslamic Period became a Christian and used to write the writing with Hebrew letters. " +
                    "He would write from the Gospel in Hebrew as much as Allah wished him to write. He was an old man and had lost his eyesight. " +
                    "Khadija said to Waraqa, \"Listen to the story of your nephew, O my cousin!\" Waraqa asked, \"O my nephew! What have you seen?\" " +
                    "Allah's Apostle described whatever he had seen. Waraqa said, \"This is the same one who keeps the secrets (angel Gabriel) " +
                    "whom Allah had sent to Moses. I wish I were young and could live up to the time when your people would turn you out.\" " +
                    "Allah's Apostle asked, \"Will they drive me out?\" Waraqa replied in the affirmative and said, \"Anyone (man) who came " +
                    "with something similar to what you have brought was treated with hostility; and if I should remain alive till the day " +
                    "when you will be turned out then I would support you strongly.\" But after a few days Waraqa died and the Divine " +
                    "Inspiration was also paused for a while. Narrated Jabir bin 'Abdullah Al-Ansari while talking about the period of pause " +
                    "in revelation reporting the speech of the Prophet \"While I was walking, all of a sudden I heard a voice from the sky. " +
                    "I looked up and saw the same angel who had visited me at the cave of Hira' sitting on a chair between the sky and the earth. " +
                    "I got afraid of him and came back home and said, 'Wrap me (in blankets).' And then Allah revealed the following Holy Verses (of Quran): " +
                    "'O you (i.e. Muhammad)! wrapped up in garments!' Arise and warn (the people against Allah's Punishment),... " +
                    "up to 'and desert the idols.' (74.1-5) After this the revelation started coming strongly, frequently and regularly.\"",

            "Narrated Said bin Jubair: Ibn 'Abbas in the explanation of the Statement of Allah. 'Move not your tongue concerning (the Quran) " +
                    "to make haste therewith.\" (75.16) Said \"Allah's Apostle used to bear the revelation with great trouble and used to " +
                    "move his lips (quickly) with the Inspiration.\" Ibn 'Abbas moved his lips saying, \"I am moving my lips in front of you " +
                    "as Allah's Apostle used to move his.\" Said moved his lips saying: \"I am moving my lips, as I saw Ibn 'Abbas moving his.\" " +
                    "Ibn 'Abbas added, \"So Allah revealed 'Move not your tongue concerning (the Qur'an) to make haste therewith. It is for us " +
                    "to collect it and to give you (O Muhammad) the ability to recite it (the Qur'an) (75.16-17) which means that Allah will make " +
                    "him (the Prophet ) remember the portion of the Qur'an which was revealed at that time by heart and recite it. The Statement of " +
                    "Allah: And 'When we have recited it to you (O Muhammad through Gabriel) then you follow its (Qur'an) recital' (75.18) means " +
                    "'listen to it and be silent.' Then it is for Us (Allah) to make It clear to you' (75.19) means 'Then it is (for Allah) to make " +
                    "you recite it (and its meaning will be clear by itself through your tongue). Afterwards, Allah's Apostle used to listen to Gabriel " +
                    "whenever he came and after his departure he used to recite it as Gabriel had recited it.\" ",

            "Narrated Ibn 'Abbas: Allah's Apostle was the most generous of all the people, and he used to reach the peak in generosity in the month of " +
                    "Ramadan when Gabriel met him. Gabriel used to meet him every night of Ramadan to teach him the Qur'an. Allah's Apostle was the " +
                    "most generous person, even more generous than the strong uncontrollable wind (in readiness and haste to do charitable deeds).",

            "Narrated 'Abdullah bin 'Abbas: Abu Sufyan bin Harb informed me that Heraclius had sent a messenger to him while he had been accompanying " +
                    "a caravan from Quraish. They were merchants doing business in Sham (Syria, Palestine, Lebanon and Jordan), at the time when Allah's " +
                    "Apostle had truce with Abu Sufyan and Quraish infidels. So Abu Sufyan and his companions went to Heraclius at Ilya (Jerusalem). " +
                    "Heraclius called them in the court and he had all the senior Roman dignitaries around him. He called for his translator who, " +
                    "translating Heraclius's question said to them, \"Who amongst you is closely related to that man who claims to be a Prophet?\" " +
                    "Abu Sufyan replied, \"I am the nearest relative to him (amongst the group).\" Heraclius said, \"Bring him (Abu Sufyan) close to me " +
                    "and make his companions stand behind him.\" Abu Sufyan added, Heraclius told his translator to tell my companions that he wanted to " +
                    "put some questions to me regarding that man (The Prophet) and that if I told a lie they (my companions) should contradict me.\" " +
                    "Abu Sufyan added, \"By Allah! Had I not been afraid of my companions labeling me a liar, I would not have spoken the truth about " +
                    "the Prophet. The first question he asked me about him was: 'What is his family status amongst you?' I replied, 'He belongs to a " +
                    "good (noble) family amongst us.' Heraclius further asked, 'Has anybody amongst you ever claimed the same (i.e. to be a Prophet) " +
                    "before him?' I replied, 'No.' He said, 'Was anybody amongst his ancestors a king?' I replied, 'No.' Heraclius asked, 'Do the nobles " +
                    "or the poor follow him?' I replied, 'It is the poor who follow him.' He said, 'Are his followers increasing decreasing (day by day)?' " +
                    "I replied, 'They are increasing.' He then asked, 'Does anybody amongst those who embrace his religion become displeased and renounce " +
                    "the religion afterwards?' I replied, 'No.' Heraclius said, 'Have you ever accused him of telling lies before his " +
                    "claim (to be a Prophet)?' I replied, 'No. ' Heraclius said, 'Does he break his promises?' I replied, 'No. We are at truce with " +
                    "him but we do not know what he will do in it.' I could not find opportunity to say anything against him except that. Heraclius asked, " +
                    "'Have you ever had a war with him?' I replied, 'Yes.' Then he said, 'What was the outcome of the battles?' I replied, 'Sometimes he was " +
                    "victorious and sometimes we.' Heraclius said, 'What does he order you to do?' I said, 'He tells us to worship Allah and Allah alone " +
                    "and not to worship anything along with Him, and to renounce all that our ancestors had said. He orders us to pray, to speak the truth, " +
                    "to be chaste and to keep good relations with our Kith and kin.' Heraclius asked the translator to convey to me the following, I asked " +
                    "you about his family and your reply was that he belonged to a very noble family. In fact all the Apostles come from noble families " +
                    "amongst their respective peoples. I questioned you whether anybody else amongst you claimed such a thing, your reply was in the negative. " +
                    "If the answer had been in the affirmative, I would have thought that this man was following the previous man's statement. Then I asked " +
                    "you whether anyone of his ancestors was a king. Your reply was in the negative, and if it had been in the affirmative, I would have " +
                    "thought that this man wanted to take back his ancestral kingdom. I further asked whether he was ever accused of telling lies before he " +
                    "said what he said, and your reply was in the negative. So I wondered how a person who does not tell a lie about others could ever tell " +
                    "a lie about Allah. I, then asked you whether the rich people followed him or the poor. You replied that it was the poor who followed him. " +
                    "And in fact all the Apostle have been followed by this very class of people. Then I asked you whether his followers were increasing or " +
                    "decreasing. You replied that they were increasing, and in fact this is the way of true faith, till it is complete in all respects. I " +
                    "further asked you whether there was anybody, who, after embracing his religion, became displeased and discarded his religion. Your reply " +
                    "was in the negative, and in fact this is (the sign of) true faith, when its delight enters the hearts and mixes with them completely. " +
                    "I asked you whether he had ever betrayed. You replied in the negative and likewise the Apostles never betray. Then I asked you what he " +
                    "ordered you to do. You replied that he ordered you to worship Allah and Allah alone and not to worship any thing along with Him and " +
                    "forbade you to worship idols and ordered you to pray, to speak the truth and to be chaste. If what you have said is true, he will very " +
                    "soon occupy this place underneath my feet and I knew it (from the scriptures) that he was going to appear but I did not know that he " +
                    "would be from you, and if I could reach him definitely, I would go immediately to meet him and if I were with him, I would certainly " +
                    "wash his feet.' Heraclius then asked for the letter addressed by Allah's Apostle which was delivered by Dihya to the Governor of Busra, " +
                    "who forwarded it to Heraclius to read. The contents of the letter were as follows: \"In the name of Allah the Beneficent, the Merciful " +
                    "(This letter is) from Muhammad the slave of Allah and His Apostle to Heraclius the ruler of Byzantine. Peace be upon him, who follows " +
                    "the right path. Furthermore I invite you to Islam, and if you become a Muslim you will be safe, and Allah will double your reward, and " +
                    "if you reject this invitation of Islam you will be committing a sin by misguiding your Arisiyin (peasants). (And I recite to you " +
                    "Allah's Statement:) 'O people of the scripture! Come to a word common to you and us that we worship none but Allah and that we " +
                    "associate nothing in worship with Him, and that none of us shall take others as Lords beside Allah. Then, if they turn away, say: " +
                    "Bear witness that we are Muslims (those who have surrendered to Allah).' (3:64). Abu Sufyan then added, \"When Heraclius had " +
                    "finished his speech and had read the letter, there was a great hue and cry in the Royal Court. So we were turned out of the court. " +
                    "I told my companions that the question of Ibn-Abi-Kabsha) (the Prophet Muhammad) has become so prominent that even the King of Bani " +
                    "Al-Asfar (Byzantine) is afraid of him. Then I started to become sure that he (the Prophet) would be the conqueror in the near future " +
                    "till I embraced Islam (i.e. Allah guided me to it).\" The sub narrator adds, \"Ibn An-Natur was the Governor of llya' (Jerusalem) " +
                    "and Heraclius was the head of the Christians of Sham. Ibn An-Natur narrates that once while Heraclius was visiting ilya' (Jerusalem), " +
                    "he got up in the morning with a sad mood. Some of his priests asked him why he was in that mood? Heraclius was a foreteller and an " +
                    "astrologer. He replied, 'At night when I looked at the stars, I saw that the leader of those who practice circumcision had appeared " +
                    "(become the conqueror). Who are they who practice circumcision?' The people replied, 'Except the Jews nobody practices circumcision, " +
                    "so you should not be afraid of them (Jews). 'Just Issue orders to kill every Jew present in the country.' While they were discussing " +
                    "it, a messenger sent by the king of Ghassan to convey the news of Allah's Apostle to Heraclius was brought in. Having heard the news, " +
                    "he (Heraclius) ordered the people to go and see whether the messenger of Ghassan was circumcised. The people, after seeing him, told " +
                    "Heraclius that he was circumcised. Heraclius then asked him about the Arabs. The messenger replied, 'Arabs also practice circumcision.' " +
                    "(After hearing that) Heraclius remarked that sovereignty of the 'Arabs had appeared. Heraclius then wrote a letter to his friend in " +
                    "Rome who was as good as Heraclius in knowledge. Heraclius then left for Homs. (a town in Syrian and stayed there till he received the " +
                    "reply of his letter from his friend who agreed with him in his opinion about the emergence of the Prophet and the fact that he was " +
                    "a Prophet. On that Heraclius invited all the heads of the Byzantines to assemble in his palace at Homs. When they assembled, he " +
                    "ordered that all the doors of his palace be closed. Then he came out and said, 'O Byzantines! If success is your desire and if you " +
                    "seek right guidance and want your empire to remain then give a pledge of allegiance to this Prophet (i.e. embrace Islam).' " +
                    "(On hearing the views of Heraclius) the people ran towards the gates of the palace like onagers but found the doors closed. " +
                    "Heraclius realized their hatred towards Islam and when he lost the hope of their embracing Islam, he ordered that they should " +
                    "be brought back in audience. (When they returned) he said, 'What already said was just to test the strength of your conviction " +
                    "and I have seen it.' The people prostrated before him and became pleased with him, and this was the end of Heraclius's story " +
                    "(in connection with his faith).",

            "Narrated Ibn 'Umar: Allah's Apostle said: Islam is based on (the following) five (principles): " +
                    "1. To testify that none has the right to be worshipped but Allah and Muhammad is Allah's Apostle. " +
                    "2. To offer the (compulsory congregational) prayers dutifully and perfectly. 3. To pay Zakat (i.e. obligatory charity) . " +
                    "4. To perform Hajj. (i.e. Pilgrimage to Mecca) 5. To observe fast during the month of Ramadan. ",

            "Narrated Abu Huraira: The Prophet said, \"Faith (Belief) consists of more than sixty branches (i.e. parts). And Haya " +
                    "(This term \"Haya\" covers a large number of concepts which are to be taken together; amongst them are self respect, " +
                    "modesty, bashfulness, and scruple, etc.) is a part of faith.\"  ",

            "Narrated 'Abdullah bin 'Amr: The Prophet said, \"A Muslim is the one who avoids harming Muslims with his tongue and hands. " +
                    "And a Muhajir (emigrant) is the one who gives up (abandons) all what Allah has forbidden.\"  ",

            "Narrated Abu Musa: Some people asked Allah's Apostle, \"Whose Islam is the best? i.e. (Who is a very good Muslim)?\" " +
                    "He replied, \"One who avoids harming the Muslims with his tongue and hands.\"",

            "Narrated 'Abdullah bin 'Amr: A man asked the Prophet , \"What sort of deeds or (what qualities of) Islam are good?\" " +
                    "The Prophet replied, 'To feed (the poor) and greet those whom you know and those whom you do not Know (See Hadith No. 27). ",

            "Narrated Anas: The Prophet said, \"None of you will have faith till he wishes for his (Muslim) brother what he likes for himself.\" ",

            "Narrated Abu Huraira: \"Allah's Apostle said, \"By Him in Whose Hands my life is, none of you will have faith till he " +
                    "loves me more than his father and his children.\" ",

            "Narrated Anas: The Prophet said \"None of you will have faith till he loves me more than his father, his children and all mankind.\" ",

            "Narrated Anas: The Prophet said, \"Whoever possesses the following three qualities will have the sweetness (delight) of faith: " +
                    "1. The one to whom Allah and His Apostle becomes dearer than anything else. " +
                    "2. Who loves a person and he loves him only for Allah's sake. " +
                    "3. Who hates to revert to Atheism (disbelief) as he hates to be thrown into the fire.\" ",

            "Narrated Anas: The Prophet said, \"Love for the Ansar is a sign of faith and hatred for the Ansar is a sign of hypocrisy.\"",

            "Narrated 'Ubada bin As-Samit: who took part in the battle of Badr and was a Naqib (a person heading a group of six persons), " +
                    "on the night of Al-'Aqaba pledge: Allah's Apostle said while a group of his companions were around him, \"Swear " +
                    "allegiance to me for: 1. Not to join anything in worship along with Allah. 2. Not to steal. " +
                    "3. Not to commit illegal sexual intercourse. 4. Not to kill your children. " +
                    "5. Not to accuse an innocent person (to spread such an accusation among people). " +
                    "6. Not to be disobedient (when ordered) to do good deed.\" The Prophet added: \"Whoever among you" +
                    " fulfills his pledge will be rewarded by Allah. And whoever indulges in any one of them (except the ascription of partners to Allah) " +
                    "and gets the punishment in this world, that punishment will be an expiation for that sin. And if one indulges in any of them, and " +
                    "Allah conceals his sin, it is up to Him to forgive or punish him (in the Hereafter).\" 'Ubada bin As-Samit added: \"So we swore " +
                    "allegiance for these.\" (points to Allah's Apostle)",

            "Narrated Abu Said Al-Khudri: Allah's Apostle said, \"A time will come that the best property of a Muslim will be sheep which he will take on " +
                    "the top of mountains and the places of rainfall (valleys) so as to flee with his religion from afflictions.\"",

            "Narrated 'Aisha: Whenever Allah's Apostle ordered the Muslims to do something, he used to order them deeds which were easy for " +
                    "them to do, (according to their strength endurance). They said, \"O Allah's Apostle! We are not like you. Allah has " +
                    "forgiven your past and future sins.\" So Allah's Apostle became angry and it was apparent on his face. He said, \"I " +
                    "am the most Allah fearing, and know Allah better than all of you do.\"",

            "Narrated Anas: The Prophet said, \"Whoever possesses the following three qualities will taste the sweetness of faith: " +
                    "1. The one to whom Allah and His Apostle become dearer than anything else. " +
                    "2. Who loves a person and he loves him only for Allah's sake. " +
                    "3. Who hates to revert to disbelief (Atheism) after Allah has brought (saved) him out from it, as he hates to be thrown in fire.\"",

            "Narrated Abu Said Al-Khudri: The Prophet said, \"When the people of Paradise will enter Paradise and the people of Hell will go to Hell, " +
                    "Allah will order those who have had faith equal to the weight of a grain of mustard seed to be taken out from Hell. So they will be " +
                    "taken out but (by then) they will be blackened (charred). Then they will be put in the river of Haya' (rain) or Hayat (life) " +
                    "(the Narrator is in doubt as to which is the right term), and they will revive like a grain that grows near the bank of a flood channel. " +
                    "Don't you see that it comes out yellow and twisted\"",

            "Narrated Abu Said Al-Khudri: Allah's Apostle said, \"While I was sleeping I saw (in a dream) some people wearing shirts of which some were " +
                    "reaching up to the breasts only while others were even shorter than that. Umar bin Al-Khattab was shown wearing a shirt that he was " +
                    "dragging.\" The people asked, \"How did you interpret it? (What is its interpretation) O Allah's Apostle?\" He (the Prophet ) " +
                    "replied, \"It is the Religion.\"",

            "Narrated 'Abdullah (bin 'Umar): Once Allah's Apostle passed by an Ansari (man) who was admonishing to his brother regarding Haya'. " +
                    "On that Allah's Apostle said, \"Leave him as Haya' is a part of faith.\"",

            "Narrated Ibn 'Umar: Allah's Apostle said: \"I have been ordered (by Allah) to fight against the people until they testify that none has " +
                    "the right to be worshipped but Allah and that Muhammad is Allah's Apostle, and offer the prayers perfectly and give the obligatory " +
                    "charity, so if they perform a that, then they save their lives an property from me except for Islamic laws and then their reckoning " +
                    "(accounts) will be done by Allah.\"",

            "Narrated Abu Huraira: Allah's Apostle was asked, \"What is the best deed?\" He replied, \"To believe in Allah and His Apostle (Muhammad). " +
                    "The questioner then asked, \"What is the next (in goodness)? He replied, \"To participate in Jihad in Allah's Cause.\" The questioner " +
                    "again asked, \"What is the next (in goodness)?\" He replied, \"To perform Hajj (Pilgrim age to Mecca) 'Mubrur, (which is accepted by " +
                    "Allah and is performed with the intention of seeking Allah's pleasure only and not to show off and without committing a sin and in " +
                    "accordance with the traditions of the Prophet).\""
    };

    //returns the Chapter name of Hadith (Index will be random number)
    public String getHadithChapterName(int num){
        num = num+1;
        if (num == hadith.length){
            num = 0;
        }
        if(num >= 0 && num <= 5){
            hadithChapterName = "Revelation";
        }else if(num >=6 && num <= 54){
            hadithChapterName = "Belief";
        }
        return hadithChapterName;
    }

    //returns a hadith from the string (Index will be random number)
    public String getHadith(int num){
        num = num+1;
        if (num == hadith.length){
            num = 0;
        }
        return hadith[num];
    }

    //returns the source of hadith (Index will be random number)
    public String getHadithSource(int num){
        num = num +1;
        if (num == hadith.length){
            num = 0;
        }
        if(num >= 0 && num <= 54) {
            hadithSource = "Sahih Al-Bukhari";
        }
        return hadithSource;
    }

    //returns the book number and chapter number of hadith (index will be random number)
    public String getBookNumber(int num){
        num = num+1;
        if (num == hadith.length){
            num = 0;
        }
        if(num >= 0 && num <= 5) {
            bookNumber = "Book 1 Hadith "+(num+1);
        }else if(num >=6 && num <= 54){
            bookNumber = "Book 2 Hadith "+ (num+1);
        }
        return bookNumber;
    }

    public int getHadithArrayLength(){
        return hadith.length;
    }
}
