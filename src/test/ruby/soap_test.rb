require "test/unit"
#require 'minitest/reporters'
#MiniTest::Reporters.use!

require 'java'
p $CLASSPATH
p $LOAD_PATH

java_import 'kravmaga.SoapServiceSimulator'
java_import 'kravmaga.generated.bookingservice.Conference'
java_import 'kravmaga.generated.bookingservice.ArrayOfParticipant'

class SoapTest < Test::Unit::TestCase

  # Called before every test method runs. Can be used
  # to set up fixture information.
  def setup
    # Do nothing
  end

  # Called after every test method runs. Can be used to tear
  # down fixture information.

  def teardown
    # Do nothing
  end

  def test_create
    client = SoapServiceSimulator.new
    conference = Conference.new
    conference.setStartTimeUTC('2012-10-10 12:00:00Z')
    conference.setEndTimeUTC('2012-10-10 13:00:00Z')
    conference.setParticipants(ArrayOfParticipant.new)
    p client.save_conference(conference)
  end
end