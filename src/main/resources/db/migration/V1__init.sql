CREATE TABLE word (
    id UUID PRIMARY KEY,
    word VARCHAR(255) NOT NULL,
    frequency_count BIGINT NOT NULL
);

CREATE TABLE "user" (
    id UUID PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE progress_learn_word (
    id UUID PRIMARY KEY,
    user_id UUID NOT NULL,
    word_id UUID NOT NULL,
    learn_date DATE NOT NULL,
    next_learn_date DATE,

    CONSTRAINT fk_progress_learn_word__user
        FOREIGN KEY (user_id) REFERENCES "user"(id),

    CONSTRAINT fk_progress_learn_word__word
        FOREIGN KEY (word_id) REFERENCES word(id)
);

CREATE TABLE word_use_example (
    id UUID PRIMARY KEY,
    user_id UUID NOT NULL,
    word_id UUID NOT NULL,
    example VARCHAR(255) NOT NULL,
    translate VARCHAR(255) NOT NULL,

     CONSTRAINT fk_word_use_example__user
        FOREIGN KEY (user_id) REFERENCES "user"(id),

    CONSTRAINT fk_word_use_example__word
        FOREIGN KEY (word_id) REFERENCES word(id)
);