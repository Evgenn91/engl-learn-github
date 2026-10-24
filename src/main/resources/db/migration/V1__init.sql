CREATE TABLE IF NOT EXISTS "word" (
    "id" character (36) not null,
    "word" character varying (255) not null,
    "frequency_count" int not null,

    CONSTRAINT "PK_word" PRIMARY KEY ("id")
);

CREATE TABLE IF NOT EXISTS "user" (
    "id" character (36) not null,
    "name" character varying (255) not null,

    CONSTRAINT "PK_user" PRIMARY KEY ("id")
    );

CREATE TABLE IF NOT EXISTS "progress_learn_word" (
    "id" character (36) not null,
    "user_id" character (36) not null,
    "word_id" character (36) not null,
    "learn_date" timestamp without time zone not null,
    "next_learn_date" timestamp without time zone,

    CONSTRAINT "PK_progress_learn_word" PRIMARY KEY ("id"),
    CONSTRAINT "FK_progress_learn_word__user" FOREIGN KEY ("user_id") REFERENCES "user" ("id")
    CONSTRAINT "FK_progress_learn_word__word" FOREIGN KEY ("word_id") REFERENCES "word" ("id")
    );

CREATE TABLE IF NOT EXISTS "word_use_example" (
    "id" character (36) not null,
    "user_id" character (36) not null,
    "word_id" character (36) not null,
    "example" character varying (255) not null,
    "translate" character varying (255) not null,

    CONSTRAINT "PK_word_use_example" PRIMARY KEY ("id"),
    CONSTRAINT "FK_word_use_example__user" FOREIGN KEY ("user_id") REFERENCES "user" ("id")
    CONSTRAINT "FK_word_use_example__word" FOREIGN KEY ("word_id") REFERENCES "word" ("id")
    );