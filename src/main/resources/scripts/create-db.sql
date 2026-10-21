/* Create Tables */

CREATE TABLE IF NOT EXISTS "dbVersion"
(
    "DB" varchar(100) NOT NULL,
    "Version" varchar(100) NOT NULL,
    CONSTRAINT "PK_dbVersion"	PRIMARY KEY ("DB")
)
;

CREATE TABLE IF NOT EXISTS "stfFileInfo"
(
	"GUID" varchar(40) NOT NULL,
	"OrganizationGUID" varchar(40) NOT NULL,
	"Name" varchar(200) NOT NULL,
	"Type" varchar(50),
	"Tag" varchar(50),
	"Size" bigint,
	"MD5" varchar(50) NOT NULL,
	"Date" timestamp without time zone NOT NULL,
	"fDelete" smallint NOT NULL DEFAULT 0,
	CONSTRAINT "PK_stfFileInfo" PRIMARY KEY ("GUID", "OrganizationGUID")
)
;

CREATE TABLE IF NOT EXISTS "stfFileBody"
(
	"GUID" varchar(40) NOT NULL,
	"OrganizationGUID" varchar(40) NOT NULL,
	"Body" bytea NOT NULL,
  CONSTRAINT "PK_stfFileBody" PRIMARY KEY ("GUID", "OrganizationGUID"),
  CONSTRAINT "FK_stfFileBody_stfFileInfo"
    FOREIGN KEY ("GUID", "OrganizationGUID") REFERENCES "stfFileInfo" ("GUID", "OrganizationGUID")
    ON DELETE No Action ON UPDATE No Action
)
;

INSERT INTO "dbVersion" ("DB", "Version")
SELECT 'storage-file', '1.0' WHERE NOT EXISTS(SELECT 1 FROM "dbVersion" WHERE "DB" = 'storage-file')
;
