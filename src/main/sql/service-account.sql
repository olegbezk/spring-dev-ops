CREATE USER 'springframework'@'localhost' IDENTIFIED BY 'oleg';

GRANT SELECT ON springdevops.* TO 'springframework'@'localhost';
GRANT CREATE ON springdevops.* TO 'springframework'@'localhost';
GRANT UPDATE ON springdevops.* TO 'springframework'@'localhost';
GRANT DELETE ON springdevops.* TO 'springframework'@'localhost';