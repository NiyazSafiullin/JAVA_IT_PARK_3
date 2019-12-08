CREATE TABLE IF NOT EXISTS persistent_logins (
  username VARCHAR(64) NOT NULL,
  series VARCHAR(64) PRIMARY KEY NOT NULL,
  token VARCHAR(64) NOT NULL,
  last_used TIMESTAMP NOT NULL
);

INSERT INTO newuser
(id, email, hash_password, state, role)
  SELECT
    1,
    'admin@niyaz.com',
    '$2a$04$lAdf5jcw6b963X4o7Ds9Bu3LM2LS/I7PaSRQgsBSJI1gbmzWznvCS',
    'CONFIRMED',
    'ADMIN'
  WHERE
    NOT EXISTS(
        SELECT id
        FROM newuser
        WHERE id = 1
    );
