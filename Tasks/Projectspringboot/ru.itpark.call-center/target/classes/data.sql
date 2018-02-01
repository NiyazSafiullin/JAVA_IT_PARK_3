INSERT INTO new_user
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
        FROM new_user
        WHERE id = 1
    );