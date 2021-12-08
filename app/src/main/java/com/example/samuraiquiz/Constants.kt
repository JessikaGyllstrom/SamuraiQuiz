package com.example.samuraiquiz

object Constants {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val question1 = Question(
            1,
            "What are the samurais three swords called?",
            "Akogare, hinode & otaku ",
            "Machi, heiki & kachi",
            "Katana, tachi & tanto",
            "Zettai, shuuri & maiasa",
            3
        )
        questionList.add(question1)

        val question2 = Question(
            1,
            "What were the person appointed to behead the individual committing seppuku (at the moment of agony) called?",
            "Kaishakunin",
            "Nakama",
            "Tataku",
            "Konoaida",
            1
        )
        questionList.add(question2)

        val question3 = Question(
            1,
            "What is Yabusame?",
            "Mounted archery",
            "A matchlockgun",
            "A type of spear",
            "A footsoldier",
            1
        )
        questionList.add(question3)

        val question4 = Question(
            1,
            "What is the Japanese meaning of Samurai?",
            "Mighty/forecefull",
            "World spirit/soul",
            "Henchman/servant",
            "Strong warrior",
            3
        )
        questionList.add(question4)

        val question5 = Question(
            1,
            "What is the more common word for samurai in Japan?",
            "Nurui",
            "Yama",
            "Tomaru",
            "Bushi",
            4
        )
        questionList.add(question5)

        val question6 = Question(
            1,
            "What were the female samurai called?",
            "Natsukashii",
            "Onna-musha",
            "Kogarashni",
            "Ugokasu",
            2
        )
        questionList.add(question6)

        val question7 = Question(
            1,
            "The samurais helmet is called?",
            "Kabuto",
            "Gakusei",
            "Wakaru",
            "Keisatsu",
            1
        )
        questionList.add(question7)

        val question8 = Question(
            1,
            "What is menpo?",
            "Leg-armor",
            "Footwear",
            "Shoulder-armor",
            "Face-mask",
            4
        )
        questionList.add(question8)

        val question9 = Question(
            1,
            "When did the battle of sekigahara occur?",
            "1550",
            "1500",
            "1600",
            "1650",
            3
        )
        questionList.add(question9)

        val question10 = Question(
            1,
            "What is the name of the first shogun?",
            "Tokugawa Ieyasu",
            "Ashikaga Takauji",
            "Minamoto Yoritomo",
            "Kujo Yoritsune",
            3
        )
        questionList.add(question10)

        val question11 = Question(
            1,
            "What daymio is considered to be “the first great unifier” of Japan?",
            "Oda Nubunaga",
            "Hideki Tojo",
            "Yukio Mishima",
            "Hiroo Onoda",
            1
        )
        questionList.add(question11)

        val question12 = Question(
            1,
            "The samurai followed an unwritten code of conduct, later to be called? ",
            "Toori",
            "Azusa",
            "Kanwa",
            "Bushido",
            4
        )
        questionList.add(question12)

        val question13 = Question(
            1,
            "What year was the Geinpeiwar fought? ",
            "1380",
            "1480",
            "1280",
            "1180",
            4
        )
        questionList.add(question13)

        val question14 = Question(
            1,
            "What samurai warrior wrote the famous book “Gorin No Sho/A book of five rings”?",
            "Yukio Mishima",
            "Hayao Miyazaki",
            "Musashi",
            "Kogekitai",
            3
        )
        questionList.add(question14)

        val question15 = Question(
            1,
            "What is the samurai-rebellion, lead by Saigō Takamori, called?",
            "Jitaku-rebellion",
            "Setsumei-rebellion",
            "Ookisa-rebellion",
            "Satsuma-rebellion",
            4
        )
        questionList.add(question15)

        val question16 = Question(
            1,
            "The traditional topknot haircut worn by the samurai, is called?",
            "Chonmage",
            "Nokoru",
            "Himitusu",
            "Odoru",
            2
        )
        questionList.add(question16)

        val question17 = Question(
            1,
            "What was the small opening on top of the samurais helmet (thought to be a passing for the wargod) called?",
            "Shuppatsu/fukatzu",
            "Tehen/hachimanza",
            "Yahari/Yorokobu",
            "Maitoshi/Mainen",
            2
        )
        questionList.add(question17)

        val question18 = Question(
            1,
            "What period is considered being the end of the samurai-warrior?",
            "Heijan-period",
            "Meiji-period",
            "Muromachi-period",
            "Edo-period",
            2
        )
        questionList.add(question18)

        val question19 = Question(
            1,
            "After a victory it was common to have a Head-viewing-ceremony or Identification of severed heads, what was this called?",
            "Oshogatsu",
            "O tanjobi",
            "Kubi-Jikken",
            "Yuugata",
            3
        )
        questionList.add(question19)

        val question20 = Question(
            1,
            "what year did it became illegal for a samurai to carry a sword?",
            "1889",
            "1827",
            "1902",
            "1876",
            4
        )
        questionList.add(question20)

        return questionList


    }

    }
